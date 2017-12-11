import java.util.ArrayList;

public class ContratMRH extends Contrat{

	
	public ContratMRH(String numC, boolean contVal) {
		super(numC, contVal);
		creationContrat();
	}

	@Override
	public void creationContrat() {
		cotisation = determinerCotisation();
		garanties.add("Incendies");
		garanties.add("Vitres");
		garanties.add("Inondation");
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
