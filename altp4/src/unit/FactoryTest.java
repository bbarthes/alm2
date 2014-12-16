package unit;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import rts.exception.ErrorDoctorWho;
import rts.facade.AbstractFactoryRtsOfFutur;
import rts.facade.FactoryOfAbstractFactoryRts;
import rts.factory.IAbstractFactoryRts;

public class FactoryTest {


	/*@Before
	public void setUp() throws Exception {
		this.soldier = new InfantrymanFacade();
		this.army = new Army();
	}*/

	@Test
	public void NoMultipleInstance()   {

		IAbstractFactoryRts afRts1 = null;
		IAbstractFactoryRts afRts2 = null;
		try {
			afRts1 = FactoryOfAbstractFactoryRts.getInstanceOfFuture();
		} catch (ErrorDoctorWho e) {
			fail ("pas encore utilisé");
		}
		try {
			afRts2 = FactoryOfAbstractFactoryRts.getInstanceOfFuture();
		} catch (ErrorDoctorWho e) {
			fail ("demande deux fois la même instance");
		}
		assertFalse(afRts1 == null);
		assertEquals(afRts1,afRts2);
	}

	@Test
	public void NoMultipleAge()   {

		IAbstractFactoryRts afRts1 = null;
		boolean multipleAge = true;
		try {
			afRts1 = FactoryOfAbstractFactoryRts.getInstanceOfFuture();
		} catch (ErrorDoctorWho e) {
			fail ("pas encore utilisé");
		}
		try {
			FactoryOfAbstractFactoryRts.getInstanceOfPast();
		} catch (ErrorDoctorWho e) {
			multipleAge = false;
		}
		assertFalse(multipleAge);
		assertFalse(afRts1 == null);
	}
	@Test
	public void Future()   {
		IAbstractFactoryRts afRts1 = null;
		try {
			afRts1 = FactoryOfAbstractFactoryRts.getInstanceOfFuture();
			assertTrue (afRts1.getClass().equals(AbstractFactoryRtsOfFutur.class));
		} catch (ErrorDoctorWho e) {
			fail ("pas encore utilisé");
		}
	}
	
	/*@Test
	public void Past()   {
		IAbstractFactoryRts afRts1 = null;
		try {
			afRts1 = FactoryOfAbstractFactoryRts.getInstanceOfPast();
			assertTrue (afRts1.getClass().equals(AbstractFactoryRtsOfPast.class));
		} catch (ErrorDoctorWho e) {
			fail ("pas encore utilisé");
		}
	}*/


}
