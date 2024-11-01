
public class carton extends feuille {
	private float ht ; // pas d'héritage
	
	public carton () {
		super();
		this.ht = 0;
	}

	public carton(float lg, float lr, float ht) {
		super(lg, lr);
		this.ht = ht;
	}
	
	public void saisir() {
		super.saisir();
		System.out.println("Donner la hauteur : ");
		this.ht = Console.SaisirFloat();
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("La hauter : " + this.ht);
	}
	
	public float perimetre() {
		return(2* super.perimetre()+4*this.ht);
	}
	
	/*public float volume() {
		return (thi)
	}*/
	
	public void menu() {
		int choix = 0;
		do {
			System.out.println("______GESTION DES ETUDIANTS______");
			System.out.println("1 - Saisir les cotés");
			System.out.println("2 - Afficher les cotés");
			System.out.println("3 - Surface");
			System.out.println("4 - Perimètre");
			/*System.out.println("5 - Volume");*/
			System.out.println("0 - Quitter");
			System.out.println("Votre choix");
			
			choix = Console.SaisirInt();
			switch (choix) {
			case 1 : this.saisir();break;
			case 2 : this.afficher();break;
			case 3 : System.out.println("Surface : " + this.surface()) ; break ;
			case 4 : System.out.println("Perimètre : " + this.perimetre()) ; break ;
			/*case 5 : System.out.println("volume : " + this.volume()) ; break ;*/
			
			}
		}while (choix !=0);
	}

}
