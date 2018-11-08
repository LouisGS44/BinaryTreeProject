
public class Ensemble {
    private int valeur;
    private Ensemble gauche;
    private Ensemble droite;

   // CONSTRUCTEURS
    public Ensemble(int x, Ensemble g, Ensemble d) {
        valeur = x;
        this.gauche = g;
        this.droite = d;
    }

    public Ensemble(int x) {
        valeur = x;
    } 
	
	public void insert(int x) {

	}
	public void delete(int x) {	
		System.out.println("test");
	}
	public boolean contains(int x) {
		return false;
	}

}
