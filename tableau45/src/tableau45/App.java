package tableau45;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
	
		//Écrire un algorithme qui respecte la demande suivante :
		//Créer 2 tableaux d’entiers de même longueur.
		//Créer un 3ème tableau dont les valeurs sont la somme des valeurs des 2 tableaux précédents.

	Scanner sc = new Scanner(System.in);
		
	int[] tableau1 = {4, 8, 7, 9, 1, 5, 4, 6};
	int[] tableau2 = {7 , 6, 5, 2, 1, 3, 7, 4};
	int[] tableau3 = new int[8];
	int somme=0;
	
	for (int i=0 ; i<tableau1.length ; i++) {
	
	somme += tableau1 [i] * tableau2[i];
	tableau3 [i]= somme;}
	
	System.out.println("la somme est :"+somme);
	 
	 
	 
	sc.close();
	
	}}