package tarifAssurance;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		
		System.out.println("Saisissez 1 nombres entier :");
			a = sc.nextInt();
			
		System.out.println("Saisissez un deuxiéme nombres entier :");
			b = sc.nextInt ();
		
			 int min;
		     int max;

		        if (a < b) {
		            min = a;
		            max = b;
		        } else {
		            min = b;
		            max = a;
		        }
		        
		        // Affichage des nombres dans l'ordre croissant
		        System.out.println("Ordre croissant :");
		        System.out.println(min);
		        System.out.println(max);}
		    
	
		
	
}
		
	


