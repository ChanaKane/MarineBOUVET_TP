import java.util.ArrayList;

public abstract class Contrat {
	private String numeroContrat ;
	private boolean contratValide ; 
	
	public abstract Contrat creationContrat();
	public abstract ArrayList<String> determinerGaranties();
	public abstract double determinerCotisation();

}
