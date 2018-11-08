
public class Ensemble {

    private int valeur;
    private Ensemble gauche;
    private Ensemble droite;

   // CONSTRUCTEURS
    public Ensemble(int x, Ensemble g, Ensemble d) {
        valeur = x;
    }

    public Ensemble(int x) {
        valeur = x;
    }

	public void insert(int x) {

        if(x <= this.valeur){

            //Ajout gauche
            if(this.gauche != null){
                this.gauche.insert(x);
            } else {
                this.gauche = new Ensemble(x);
            }

        } else {

            //Ajout droit
            if(this.droite != null){
                this.droite.insert(x);
            } else {
                this.droite = new Ensemble(x);
            }

        }

	}

	public void delete(int x) {

        if(x <= this.valeur){

            //Ajout gauche
            if(this.gauche != null){
                this.gauche.delete(x);
            } else {
                this.gauche = null;
            }

        } else {

            //Ajout droit
            if(this.droite != null){
                this.droite.delete(x);
            } else {
                this.droite = null;
            }

        }
	}

	public boolean contains(int x) {

        if (x == this.valeur){return true;}

        if(x < this.valeur){

            return gauche.contains(x);

        } else {

            return droite.contains(x);

        }
	}

}
