
		public static boolean rechercherSiChiffreExiste(int[] tab, int chiffreARechercher) {
		chiffreARechercher = 5 ;
		boolean ok = false; // Initialise un booléen sur Faux pour indiquer si le numéro est trouvé
	    for (int element : tab) { // Parcourir chaque élément du tableau
	        if (element == chiffreARechercher) // Vérifiez si l'élément actuel correspond au numéro rechercher
	            ok = true; // Place le booléen sur Vrai si le numéro est trouvé
	            break; // Pas besoin de continuer si le numéro est trouvé 
	        }
		}
		
		return ok; // Renvoi le booléen Ok 
	}
					
	
	
					// MAIN 
	
	
	//POUR VERIFIER SI LE CHIFFRE EXISTE
	
	
	
	int[] tab = new int[]{2, 5, 18, 46};
	int chiffreARechercher = 5;
	boolean existe = rechercherSiChiffreExiste(tab, chiffreARechercher);
	System.out.println("Le chiffre " + chiffreARechercher + " existe-t-il dans le tableau ? " + existe);