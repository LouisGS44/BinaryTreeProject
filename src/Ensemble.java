
public class Ensemble {
    private int valeur;
    private Ensemble gauche, droite;   

   // CONSTRUCTEURS
    public Ensemble(int x) {
        valeur = x;
    }

    public Ensemble(int x, Ensemble g, Ensemble d) {
        valeur = x;
        gauche = g;
        droite = d;
    }

	public void insert(int x) {

        if(x <= this.valeur){

            //Parcours gauche
            if(this.gauche != null){
                this.gauche.insert(x);
            } else {
                this.gauche = new Ensemble(x);
            }
            System.out.println(this.gauche);

        } else {

            //Parcours droit
            if(this.droite != null){
                this.droite.insert(x);
            } else {
                this.droite = new Ensemble(x);
            }
            System.out.println(this.droite);
        }       
	}
	public void delete(int x) {	
		System.out.println("test");
	}
	public boolean contains(int x) {
		return false;
	}
	
	public String toString() {
		return "" + this.valeur;
	}

}
