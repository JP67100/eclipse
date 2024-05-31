package sommeDesValeursDe2tableaux45;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
			
			Scanner sc =new Scanner (System.in);
			int[] tableau = new int [8];
			int [] tableau2 = new int [8];
			
			tableau [0] = 4;  
			tableau [1] = 8;
			tableau [2]	= 7;			
			tableau [3] = 9;
			tableau [4] = 1;
			tableau [5] = 5;
			tableau [6] = 4;
			tableau [7] = 6;
			
			tableau2[0] = 7;
			tableau2[1] = 6;
			tableau2[2] = 5;
			tableau2[3] = 2;
			tableau2[4] = 1;
			tableau2[5] = 3;									
			tableau2[6] = 7;
			tableau2[7] = 4;
			
			for (int somme1= 0; somme1<tableau.length ; somme1++) {
				somme1 = sc.nextInt()	;	
			for (int somme2 = 0; somme2<tableau2.length ; somme2++) {
			somme2 = sc.nextInt();
		
			
			System.out.println("resultat :"+ somme1+ somme2);
			}
			}
			
			
	
			sc.close();	
	
	}}


