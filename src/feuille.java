
public class feuille extends fil
{
	protected float lr;
	
	public feuille() {
		super (); //appelle du constructeur de la classe mère : fil, il réferncie le public fil ()
		this.lr = 0;
	}

	public feuille(float lg, float lr) {
		super(lg); //appelle du cosntructeur de la classe mère fil
		this.lr = lr;
	}
	
	public void saisir() {
		super.saisir();
		System.out.println("Donner la largeur : ");
		this.lr = Console.SaisirFloat();
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("La largeur : " + this.lr);
	}
	
	public float surface () {
		return (this.lr * super.lg);
	}
	
	public float perimetre() {
		return (2*(this.lr + super.lg));
	}
	
	public void menu() {
		int choix = 0;
		do {
			System.out.println("______MENU______");
			System.out.println("1 - Saisir les cotés");
			System.out.println("2 - Afficher les cotés");
			System.out.println("3 - Surface");
			System.out.println("4 - Perimètre");
			System.out.println("0 - Quitter");
			System.out.println("Votre choix");
			
			choix = Console.SaisirInt();
			switch (choix) {
			case 1 : this.saisir();break;
			case 2 : this.afficher();break;
			case 3 : System.out.println("Surface : " + this.surface()) ; break ;
			case 4 : System.out.println("Perimètre : " + this.perimetre()) ; break ;
			}
		}while (choix !=0);
	}

}
