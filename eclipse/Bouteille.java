package bouteille;

class Bouteille {

	// attributes

	private float contenanceEnL;
	private float contenuEnL;
	private boolean ouvert;
	private String typeDeContenu;

	// access/modifier
	// constructor

	public Bouteille() {
		contenanceEnL = 1;
		contenuEnL = 1;
		ouvert = false;
		typeDeContenu = "H2O";
	}

	// constructeur classique
	// The user will provide the details

	public Bouteille(float _contenanceEnL, float _contenuEnL, boolean _ouvert, String _typeDeContenu) {
		this.contenanceEnL = _contenanceEnL;
		this.contenuEnL = _contenuEnL;
		this.ouvert = _ouvert;
		this.typeDeContenu = _typeDeContenu;

		// _bouteilleARecopier.typeDeContenu="Champagne";

	}
	// Constructeur par ecopie ou clonage

	public Bouteille(Bouteille _bouteilleARecopier) {
		this.contenanceEnL = _bouteilleARecopier.contenanceEnL;
		this.contenuEnL = _bouteilleARecopier.contenuEnL;
		this.ouvert = _bouteilleARecopier.ouvert;
		this.typeDeContenu = _bouteilleARecopier.typeDeContenu;

	}
//methods

	public float donneContenanceEnCL() {

		float result;

		result = this.contenanceEnL * 100;

		return result;
	}

	public boolean fermetur() {
		
		boolean fermerOn;
		
		if (this.ouvert=true) {
		
			fermerOn=true;
	}
		else fermerOn=false;
		
		if (fermerOn=true) {
		
			this.ouvert=false;
		
			fermerOn=this.ouvert;
	}
		return fermerOn

	public boolean ouverture() {

		boolean ouvertOn;

		if (this.ouvert = false) {

			ouvertOn = true;
		}

		else
			ouvertOn = false;

		if (ouvertOn = true) {

			this.ouvert = true;

			ouvertOn = this.ouvert;
		}
		return ouvertOn;

	}

	public String typeDeContenu;

}

}}
