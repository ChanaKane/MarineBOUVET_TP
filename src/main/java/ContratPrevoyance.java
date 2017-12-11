import java.util.ArrayList;

public class ContratPrevoyance extends Contrat{

	public ContratPrevoyance(String numC, boolean contVal) {
		super(numC, contVal);
		creationContrat();
	}

	@Override
	public void creationContrat() {
		cotisation = determinerCotisation();
		garanties.add("Accidents de la vie");
		garanties.add("Maladie");
		garanties.add("Mutuelle");
	}

	@Override
	public ArrayList<String> determinerGaranties() {
		
		return garanties;
	}

	@Override
	public double determinerCotisation() {
		return 75.0;
	}

}
