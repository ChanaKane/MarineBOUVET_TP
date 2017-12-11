import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		CompagnieAssurance cie = new CompagnieAssurance("MarineCie");
		ArrayList<Personne> person = new ArrayList<Personne>();
		@SuppressWarnings("deprecation")
		Personne p1 = new Personne (false,"Bouvet", "Marine",new Date("06/08/1995"));
		@SuppressWarnings("deprecation")
		Personne p2 = new Personne (true,"Renard", "Dylan",new Date("08/04/1996"));
		person.add(p1);
		person.add(p2);
		System.out.println(person);
		
	}

}
