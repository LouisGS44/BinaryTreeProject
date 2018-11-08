public class Arbre {
    private int valeur;
    private Arbre gauche, droit;   

   // CONSTRUCTEURS
    public Arbre(int x) {
        valeur = x;
    }

    public Arbre(int x, Arbre g, Arbre d) {
        valeur = x;
        gauche = g;
        droit = d;
    } 

    // ACCESSEURS
    public int getValeur() {
        return(valeur);
    }

    public Arbre getSousArbreGauche() {
        return(gauche);
    }   

    public Arbre getSousArbreDroit() {
        return(droit);
    }

    // AFFICHAGE
    public String toString() {
        return toString("\t");
    }

    public String toString(String s) {
	if (gauche!=null) {
	if (droit!=null) 
	    return(s+valeur+"\n"+gauche.toString(s+"\t")+droit.toString(s+"\t"));
	else
	    return(s+valeur+"\n"+gauche.toString(s+"\t")+"\n");
        }
        else 
	if (droit!=null) 
	    return(s+valeur+"\n\n"+droit.toString(s+"\t"));
	else
	    return(s+valeur+"\n");
    }

   /**
     * Affiche l'arbre selon un parcours prefixe
     */
    public void ParcoursPrefixe() {
	System.out.println(getValeur());
	if (getSousArbreGauche() != null)
	    getSousArbreGauche().ParcoursPrefixe();
	if (getSousArbreDroit() != null)
	    getSousArbreDroit().ParcoursPrefixe();
    }

   /**
     * Affiche l'arbre selon un parcours infixe
     */
    public void ParcoursInfixe() {
	if (getSousArbreGauche() != null)
	    getSousArbreGauche().ParcoursInfixe();
	System.out.println(getValeur());
	if (getSousArbreDroit() != null)
	    getSousArbreDroit().ParcoursInfixe();
    }

   /**
     * Affiche l'arbre selon un parcours postfixe
     */
    public void ParcoursPostfixe() {
	if (getSousArbreGauche() != null)
	    getSousArbreGauche().ParcoursPostfixe();
	if (getSousArbreDroit() != null)
	    getSousArbreDroit().ParcoursPostfixe();
	System.out.println(getValeur());
    }

   /**
     * Teste si deux arbres sont egaux, meme valeurs et meme disposition
     * @param a l'arbre a comparer a b
     * @param b l'arbre a comparer a a
     * @return un boolean indiquant si les arbres sont egaux
     */
    public static boolean arbresEgaux(Arbre a, Arbre b) {
	if ((a == null) && (b == null))
	    return true;
	if ((a == null) && (b != null))
	    return false;
	if ((a != null) && (b == null))
	    return false;

	// A ce point, a et b != null, on peut acceder a leurs champs
	if (a.getValeur() != b.getValeur())
	    return false;
	return (arbresEgaux(a.getSousArbreGauche(), b.getSousArbreGauche()) 
		&& arbresEgaux(a.getSousArbreDroit(), b.getSousArbreDroit()));
    }

   /**
     * @param a un arbre
     * @return la hauteur de l'arbre a
     */
    public static int hauteur(Arbre a) {
	if (a == null)
	    return 0;
	else
	    return (1 + Math.max(hauteur(a.getSousArbreGauche()), hauteur(a.getSousArbreDroit())));
    }
    }

   /**
     * Affiche l'arbre selon un parcours en largeur
     */
 