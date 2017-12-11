import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Personne implements Comparator<Personne> {
	private boolean estUnClient;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	public ArrayList<Personne> famille;
	public ArrayList<Contrat> contrats;
	
	public Personne (boolean cli, String name, String firstname, Date birth)
	{
		this.estUnClient = cli;
		this.nom = name;
		this.prenom = firstname;
		this.dateDeNaissance = birth;
	}
	
	public boolean estClient()
	{
		return estUnClient;
	}
	
	public String obtenirNomComplet()
	{
		return nom + " " + prenom;
	}
	
	public Date obtenirDateDeNaissance()
	{
		return dateDeNaissance;
	}
	
	public Contrat creerContrat (String typeC, String num)
	{
		Contrat c = null;
		if(typeC.equals("auto"))
		{
			c = new ContratAuto (num, true);
		}else
			if(typeC.equals("mrh"))
			{
				c = new ContratMRH (num, true);
			}else
				if(typeC.equals("prevoyance"))
				{
					c = new ContratPrevoyance (num, true);
				}
		return c; 
	}
	public void resilierContrat (Contrat cont)
	{
		contrats.remove(cont);
	}
	public void resilierContrat (String cont)
	{
		for (Contrat c : contrats)
		{
			if(c.numeroContrat.equals(cont))
			{
				contrats.remove(c);
				return;
			}
				
		}
	}
	public ArrayList<Contrat> obtenirContrats ()
	{
		return contrats;
	}
	
	public ArrayList<Contrat> obtenirContratsAuto ()
	{
		ArrayList<Contrat> contratsAuto = new ArrayList<Contrat>();
		for (Contrat c : contrats)
		{
			if(c instanceof ContratAuto)
			{
				contratsAuto.add(c);
			}	
		}
		return contratsAuto;
	}
	
	public ArrayList<Contrat> obtenirContratsMRH ()
	{
		ArrayList<Contrat> contratsMRH = new ArrayList<Contrat>();
		for (Contrat c : contrats)
		{
			if(c instanceof ContratMRH)
			{
				contratsMRH.add(c);
			}
				
		}
		return contratsMRH;
	}
	public String toString()
	{
		
		return "Le client est " + nom + " " + prenom + " contrat ? " + estUnClient;
	}

	public int compare(Personne o1, Personne o2) {
		if(o1.obtenirContrats().size()<o2.obtenirContrats().size())
		{
			return 0;
		}
		return 1;
			
	}

}
