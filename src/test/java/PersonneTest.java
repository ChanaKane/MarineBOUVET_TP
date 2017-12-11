import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;


public class PersonneTest {

	@SuppressWarnings("deprecation")
	Personne p = new Personne (false,"Bouvet", "Marine",new Date("06/08/1995"));
//	@Test
//	public void testPersonne() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testEstClient() {
		Assert.assertEquals(false, p.estClient());
	}

	@Test
	public void testObtenirNomComplet() {
		Assert.assertEquals("Bouvet Marine", p.obtenirNomComplet());
	}

	@Test
	public void testObtenirDateDeNaissance() {
		Assert.assertEquals(new Date("06/08/1995"), p.obtenirDateDeNaissance());
	}

//	@Test
//	public void testCreerContrat() {
//		Assert.assertEquals("false", p.estClient());
//	}

//	@Test
//	public void testResilierContratContrat() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testResilierContratString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testObtenirContrats() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testObtenirContratsAuto() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testObtenirContratsMRH() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testToString() {
//		Assert.assertEquals("false", p.estClient());
//	}

}
