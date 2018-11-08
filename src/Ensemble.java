
public class Ensemble {
    private int valeur;
    private Ensemble gauche, droit;   

   // CONSTRUCTEURS
    public Ensemble(int x) {
        valeur = x;
    }

    public Ensemble(int x, Ensemble g, Ensemble d) {
        valeur = x;
        gauche = g;
        droit = d;
    } 
	
	public void insert(int x) {	
	}
	public void delete(int x) {	
	}
	public boolean contains(int x) {
		return false;
	}
}
