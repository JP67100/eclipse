	package sommeDesVAleurs44; // Or any meaningful package name
	
	import java.util.Scanner;

	public class App {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // Use a descriptive variable name

	        // Get the length of the arrays from the user
	        System.out.print("Entrez la longueur des tableaux : ");
	        int longueur = scanner.nextInt();

	        // Create and initialize the first array
	        int[] tableau1 = new int[longueur];
	        System.out.println("Entrez les valeurs du premier tableau :");
	        for (int i = 0; i < longueur; i++) {
	            System.out.print("Valeur " + (i + 1) + " : ");
	            tableau1[i] = scanner.nextInt();
	        }

	        // Create and initialize the second array
	        int[] tableau2 = new int[longueur];
	        System.out.println("Entrez les valeurs du deuxième tableau :");
	        for (int i = 0; i < longueur; i++) {
	            System.out.print("Valeur " + (i + 1) + " : ");
	            tableau2[i] = scanner.nextInt();
	        }

	        // Create and initialize the third array (sum array)
	        int[] tableauSomme = new int[longueur];
	        for (int i = 0; i < longueur; i++) {
	            tableauSomme[i] = tableau1[i] + tableau2[i];
	        }

	        // Display the sum array
	        System.out.println("Tableau des sommes :");
	        for (int i = 0; i < longueur; i++) {
	            System.out.print(tableauSomme[i] + " ");
	        }

	        scanner.close(); // Close the Scanner to avoid resource leaks
	    
	
	
	
	}}

		
		
		
		
		
	
	

