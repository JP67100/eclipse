package esTuMajeur;
import java.util.Scanner;
public class App {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int age;
	{
	System.out.println("Entrez votre age :");
	age = sc.nextInt();}
	
	if (age>=18){
	System.out.println("Vous êtes majeur !");}
	
	else if(age >0) {
	System.out.println("Vous êtes mineur!");}
    
    else { 
		System.out.println("Vous n'êtes pas née !");}
	
	sc.close();

}}
