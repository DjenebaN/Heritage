
public class fil {
	protected float lg;
	
	public fil() {
		this.lg = 0;
	}

	public fil(float lg) {
		super(); // la classe mère de  toutes les classes : Object
		this.lg = lg;
	}
	
	public void saisir() {
		System.out.println("Donner la longueur : ");
		this.lg = Console.SaisirFloat();
	}
	
	public void afficher() {
		System.out.println("La longueur : " + this.lg);
	}
	
	public void menu() {
		int choix = 0;
		do {
			System.out.println("______MENU______");
			System.out.println("1 - Saisir la longueur");
			System.out.println("2 - Afficher la longueur");
			System.out.println("0 - Quitter");
			choix = Console.SaisirInt();
			switch (choix) {
			case 1 : this.saisir();break;
			case 2 : this.afficher(); break ;
			}
		}while (choix !=0);
	}

	
}

