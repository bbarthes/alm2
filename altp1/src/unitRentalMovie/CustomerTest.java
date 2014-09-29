package unitRentalMovie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import rentalMovie.Customer;


public class CustomerTest {

	private Customer cus;
	private String name;

	@Before
	public void setUp() throws Exception {
		this.name = "Bernard";
		cus = new Customer(this.name);

	}

	@Test
	public void testCustomer() {
		assertNotNull(this.cus);
		assertEquals(this.cus.getName(), this.name);

	}

	@Test
	public void testStatement() {
		String sta = "Rental Record for " + this.name;
		sta += "\nAmount owned is 0.0\nYou earned 0 frequent renter points";
		System.out.println(this.cus.statement());
		assertEquals(this.cus.statement(), sta);
	}

}
