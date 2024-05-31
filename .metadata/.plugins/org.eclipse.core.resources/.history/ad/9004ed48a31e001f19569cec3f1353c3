package tableau44;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	int[] tableau = new int[5];
	int[] tableau2 = new int[5];
	int[] tableau3 = new int [tableau.length];
	
	System.out.println( " Saisissez vos 5 nombres :");
		for (int i=0 ; i<5 ; i++)             { 
			tableau [i] = sc.nextInt();       }
	
	System.out.println("Entrez les valeurs du deuxième tableau :");
		for (int j=0 ; j<5 ; j++)          {
			tableau2 [j] = sc.nextInt();   }
	
	App.somme(tableau, tableau2, tableau3);
	
	System.out.print("La somme des valeurs des 2 tableaux précédents sont : " );
		for (int k = 0; k < tableau3.length ; k++) {
	System.out.print(tableau3[k] + " " );     
	}
		sc.close();}
	
	public static void somme(int tableau1[], int tableau2[], int tableau3[]) {

		for (int i = 0; i < tableau1.length; i++)			    {
			tableau3[i] = tableau1[i] + tableau2[i];
		}
	

	}
}
