import java.util.ArrayList;

public class ContratAuto extends Contrat {
	
	
	public ContratAuto(String numC, boolean contVal) {
		super(numC, contVal);
		creationContrat();
	}

	@Override
	public void creationContrat() {
		cotisation = determinerCotisation();
		garanties.add("Accidents");
		garanties.add("Brie de glace");
		garanties.add("Responsabilité Civile");
	}

	@Override
	public ArrayList<String> determinerGaranties() {
		
		return garanties;
	}

	@Override
	public double determinerCotisation() {
		return 150.0;
	}

}
