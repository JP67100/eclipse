package CANAPE;

public class CANAPE {
	
	  // Attributs pour décrire les caractéristiques d'un canapé
	  private String type; // "2 places", "3 places", "d'angle", etc.
	  private String revêtement; // "Cuir", "Tissu", etc.
	  private String couleur; // "Gris", "Bleu", etc.
	  private int longueur; // En centimètres
	  private int largeur; // En centimètres
	  private int hauteur; // En centimètres
	 
	  public CANAPE() {
	  type  = "3 places";
	  revêtement = "tissus";
	  couleur = "Gris";
	  longueur = 200;
	  largeur = 80;
	  hauteur = 100;
	  }
	  

	  // Constructeur pour initialiser un canapé
	  public CANAPE(String type, String revêtement, String couleur, 
	                int longueur, int largeur, int hauteur) {
	    this.type = type;
	    this.revêtement = revêtement;
	    this.couleur = couleur;
	    this.longueur = longueur;
	    this.largeur = largeur;
	    this.hauteur = hauteur;
	  }
	
	  // Getters pour accéder aux attributs du canapé
	  public String getType() {
	    type = this.revêtement;
		  return type;
	  }

	  public String getRevêtement(String revêtement) {
		  this.revêtement = revêtement;
		  return revêtement;
	  }

	  public String getCouleur() {
	    return couleur;
	  }

	  public int getLongueur() {
	    return longueur;
	  }

	  public int getLargeur() {
		  
	    return largeur;
	  }

	  public int getHauteur() {
	    return hauteur;
	  }


}
