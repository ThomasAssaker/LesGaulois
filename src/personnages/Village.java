package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbvillageois;
	private char villageois;
	
	public Village(String nom,int nbVillageisMaximum) {
		this.chef = chef;
		villageois= new Gaulois[nbVillageoisisMaximum];
		
	}
	
	public String setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	public ajouterHabitant(Gaulois gaulois) {
		villageois[nbvillageois]=gaulois;
		nbvillageois++
		
	}
}
