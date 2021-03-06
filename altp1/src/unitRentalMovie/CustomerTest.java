package unitRentalMovie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import rentalMovie.*;

public class CustomerTest {

	private Customer cus;
	private tp1_original.Customers oldCus;
	private String name;

	@Before
	public void setUp() throws Exception {
		this.name = "Bernard";
		this.cus = new Customer(this.name);
		this.oldCus = new tp1_original.Customers(this.name);

	}

	@Test
	public void testCustomer() {
		assertNotNull(this.cus);

	}

	@Test
	public void testGetName()
	{
		assertEquals(this.cus.getName(), this.oldCus.getName());
	}

	@Test
	public void testStatement() {
		for(int i =0; i<= 10; i++){
			assertEquals(this.oldCus.statement(),this.cus.statement());
			
			Movie mov = new Movie("petit poney", PriceCode.CHILDREN);
			tp1_original.Movie movOld = new tp1_original.Movie("petit poney", 2);
			Rental ren = new Rental(mov, i);
			tp1_original.Rental renOld = new tp1_original.Rental(movOld, i);
			
			this.cus.addRental(ren);
			this.oldCus.addRental(renOld);
		}
	}

}
