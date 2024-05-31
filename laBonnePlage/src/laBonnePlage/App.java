package laBonnePlage;
import java.util.Scanner;

public class App {

	public static void main(String[] args, int scNextInt) {
	
		Scanner sc = new Scanner(System.in);
		
	 int nombre;

	 System.out.println("Entrez un chiffre entre 1 et 3 :");
	 nombre=scNextInt;
	 
	 if (nombre >=1 || nombre <=3 ) { 
	 System.out.println("Vous avez réussi !");
	 }
	 sc.close();
	
	
	
	
	
	
	
	
	
	
	}

}
