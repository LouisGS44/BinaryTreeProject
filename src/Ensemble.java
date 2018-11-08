
public class Ensemble {
    private Node valeur;

   // CONSTRUCTEURS
    public Ensemble(int x) {
        valeur.valeur = x;
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

	class Node{
        int valeur;
        Node gauche;
        Node droit;

        public Node(){

        }

    }
}
