package java_base;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static String reverseCaracters(String entree) {
		String alt = "";
		for(int i = entree.length()-1 ; i >= 0 ; i--) {
			alt += entree.charAt(i);
		}
		return alt;
	}
	
	public static void pyramid(int entree) {
		String s = "";
		for(int i = 0 ; i < entree ; i++) {
			for(int j = entree-i ; j > 1 ; j--) {
				s += " ";
			}
			for(int j = 0 ; j < i ; j++) {
				s += "* ";
			}
			s += "\n";
		}
		System.out.println(s);
	}
	
	public static void countToTenThousand() {
		int resu = 0;
		int i = 1;
		while(i <= 10000) {
			resu += i++;
		}
		System.out.println(resu);
	}
	
	public static void isPairImpairPremier(int entree) {
		String premierresu = "";
		
		if(entree%2 == 0 ) {
			premierresu = "pair";
		}
		else {
			premierresu = "impair";
		}
		
		int reste;
		boolean resu = true;
		for(int i = 2 ; i <= entree/2 ; i++) {
			reste = entree%i;
			if(reste == 0 ) {
				resu = false;
			}
		}
		
		if(resu) {
			premierresu += " et premier";
		}
		else {
			premierresu += " et pas premier";
		}
		
		System.out.println(premierresu);
	}
	
	public static void petitJeu() {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		int entree = scanner.nextInt();
		
		int nbATrouver = r.nextInt(50);
		//System.out.println(nbATrouver);
		
		int coupsMax = 6;
		int i = 0;
		int reste;
		boolean gagnee = false;
		while(i < coupsMax && !gagnee) {
			reste = coupsMax-i;
			if(entree > nbATrouver) {
				System.out.println("Plus petit ! Plus que " + reste + " coups...");
				i++;
				entree = scanner.nextInt();	
			}
			else if(entree < nbATrouver) {
				System.out.println("Plus grand ! Plus que " + reste + " coups...");
				i++;
				entree = scanner.nextInt();	
			}
			else {
				gagnee = true;
			}
		}
		
		if(gagnee) {
			System.out.println("Tu as gagné !!!");
		}
		else {
			System.out.println("Tu as perdu...");
		}
		
	}
	
	public static void nbMotsPhrase(String entree) {
		int nbMots = 1;
		for (int i = 0 ; i < entree.length() ; i++) {
			if(entree.charAt(i) == ' ') {
				nbMots++;
			}
		}
		
		System.out.println("Il y a " + nbMots + " mots.");
	}
	
	public static void saveSentence(String entree) throws IOException {
	    BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"));
	    writer.write(entree);
	    
	    writer.close();
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.println("Inscrire une chaine de caractère : ");
		System.out.println(reverseCaracters(scanner.nextLine()));
		
		System.out.println("Inscrire un nombre pour construire une pyramide : ");
		pyramid(scanner.nextInt());
		countToTenThousand();
		
		System.out.println("Inscrire un nombre pour savoir s'il est pair/impair/premier : ");
		isPairImpairPremier(scanner.nextInt());*/
		
		/*System.out.println("Allons jouer un petit jeu !\nIl faut que tu devines le nombre qu'a choisi l'ordinateur. Tu as droit à 5 coups.\nBonne chance!");
		petitJeu();*/
		
		nbMotsPhrase(scanner.nextLine());
		saveSentence(scanner.nextLine());
		
		/*Rectangle rectangle = new Rectangle(3, 5);
		rectangle.display();
		rectangle.calculSurface();*/
				
	}

}
