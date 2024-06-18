package CANAPE ;

public class APP {

	public static <Canape> void main(String[] args) {
		
		
		
	    CANAPE CANAPE = new CANAPE ("3 places", "Tissu", "Gris", 200, 80, 100);
		
	}
	 // Méthode pour afficher une description du canapé
		public void afficherDescription() {
			
			String CANAPE= CANAPE.getType();
		  
	
	    System.out.println("**Canape**");
	    System.out.println("Type : " + type);
	    System.out.println("Revêtement : " + get.revêtement);
	    System.out.println("Couleur : " + get.couleur);
	    System.out.println("Dimensions : " + longueur + " cm x " + largeur + " cm x " + hauteur + " cm");
	  }
}
