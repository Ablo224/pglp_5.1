package uvsq21606235;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Iterator;

import org.junit.Test;

import uvsq21606235.Personnes.GroupePersonnel;
import uvsq21606235.Personnes.PersonnelInterface;


public class GroupePersonnelTest {

	@Test
	public void testAdd() {
		GroupePersonnel gp = new GroupePersonnel();
		gp.add(new GroupePersonnel());
		Iterator<PersonnelInterface> ip = gp.iterator();
		assertFalse(!ip.hasNext());
	}
	
	@Test
	public void testDelete() {
		GroupePersonnel gp = new GroupePersonnel();
		GroupePersonnel gp1 = new GroupePersonnel();
		gp.add(gp1);
		gp.delete(gp1);
		Iterator<PersonnelInterface> p = gp.iterator();
		assertTrue(!p.hasNext());
	}
	
	/**
	 * test pour savoir si la serialisation à marcher
	 */
	@Test
	public void testSerialization() {
	    GroupePersonnel gp1 = new GroupePersonnel();
	    GroupePersonnel gp2 = new GroupePersonnel();
	    gp1.add(gp2);
        
        gp1.serialisation("essai.txt");
        File f = new File("essai.txt");
        assertNotNull(f);
	}
}
