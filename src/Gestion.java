
public class Gestion {

	public static void main(String[] args) {
		
		fil unFil = new fil();
		feuille uneFeuille = new feuille();
		carton  unCarton = new carton();
		int choix = 0;
		do {
			System.out.println("______MENU HERITAGE______");
			System.out.println("1 - Gérer un fil");
			System.out.println("2 - Gérer une feuille");
			System.out.println("3 - Gérer un carton");
			System.out.println("0 - Quitter");
			choix = Console.SaisirInt();
			switch (choix) {
			case 1 : unFil.menu();break;
			case 2 : uneFeuille.menu(); break ;
			case 3 : unCarton.menu(); break ;
			}
		}while (choix !=0);
		
	
	}

	}

