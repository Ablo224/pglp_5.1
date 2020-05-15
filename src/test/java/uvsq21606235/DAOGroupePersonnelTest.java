package uvsq21606235;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import uvsq21606235.DAO.DAOGroupePersonnel;
import uvsq21606235.Personnes.GroupePersonnel;

public class DAOGroupePersonnelTest {

	@Test
    public void testAjout() {
        DAOGroupePersonnel daogp = new DAOGroupePersonnel();
        GroupePersonnel gp = new GroupePersonnel();
        daogp.ajout(gp);
        assertNotNull(daogp);
    }

    @Test
    public void testSuppression() {
        DAOGroupePersonnel daogp = new DAOGroupePersonnel();
        GroupePersonnel gp = new GroupePersonnel();
        daogp.ajout(gp);
        daogp.supprimerElement(gp);
        assertNotNull(daogp);
    }
}
