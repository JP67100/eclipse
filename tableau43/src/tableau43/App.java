package tableau43;
import java.util.Scanner;
public class App {

	//Écrire un algorithme permettant à l’utilisateur de saisir un nombre quelconque de valeurs, qui devront être stockées dans un tableau.
	//L’utilisateur doit donc commencer par entrer le nombre de valeurs qu’il compte saisir. Il effectuera ensuite cette saisie. Enfin, 
	//une fois la saisie terminée, le programme affichera le nombre de valeurs négatives et le nombre de valeurs positives.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez vos valeurs");
		int positif = 0;
		int negatif = 0;
		int i = 0;
		int limiteTableau;
		
		System.out.println("Entrer le nombre de valeurs que vous souhaitez saisir : ");
		limiteTableau = sc.nextInt();
	
		int tableau[] = new int[limiteTableau];
		
		System.out.println("Saisissez vos valeurs :");
		
		for(i= 0; i < limiteTableau; i++) {
	    
		tableau [i] = sc.nextInt();
		
		if(tableau[i] < 0) {
			negatif += -1;
		}
		else {
			positif += 1;
		}}
		if(limiteTableau == negatif) {
			System.out.print("Toutes les valeurs sont négatives");}
		
		else if (limiteTableau == positif) {
			System.out.print("Toutes les valeurs sont positives");
		}
		else {
		System.out.print("Il y a " + negatif + " nombres négatifs, et " + positif + " nombres positifs.");
		}
		
		sc.close();

		

	}

}
