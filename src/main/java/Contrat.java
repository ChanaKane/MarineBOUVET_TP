import java.util.ArrayList;

public abstract class Contrat {
	protected String numeroContrat ;
	protected boolean contratValide ; 
	protected double cotisation;
	protected ArrayList<String> garanties;
	
	public Contrat (String numC, boolean contVal)
	{
		this.numeroContrat = numC;
		this.contratValide = contVal;
	}
	
	public abstract void creationContrat();
	public abstract ArrayList<String> determinerGaranties();
	public abstract double determinerCotisation();

	
}
