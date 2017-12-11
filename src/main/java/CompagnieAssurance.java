import java.util.ArrayList;
import java.util.Comparator;

public class CompagnieAssurance{
	private String nom;
	public ArrayList<Personne> personne;
	
	public CompagnieAssurance(String name)
	{
		this.nom = name;
		
	}
	
	public Personne obtenirPlusGrosClient()
	{
		Personne gros = personne.get(0);
		for (Personne p : personne)
		{
			if (p.compare(p,gros)==1)
			{
				gros = p;
			}
		}
		return gros;
	}
	public int obtenirNombreDeClients()
	{
		int nbClients =0 ;
		for (Personne p : personne)
		{
			if(p.estClient())
			{
				nbClients++;
			}
		}
		return nbClients;
	}
	
	public int obtenirNombreDeProspects()
	{
		int nbProspects =0 ;
		for (Personne p : personne)
		{
			if(!p.estClient())
			{
				nbProspects++;
			}
		}
		return nbProspects;
	}
	
	public int obtenirNombreDeContrats()
	{
		int nbContrats =0 ;
		for (Personne p : personne)
		{
			if(p.estClient())
			{
				nbContrats+=p.obtenirContrats().size();
			}
		}
		return nbContrats;
	}

	
}
