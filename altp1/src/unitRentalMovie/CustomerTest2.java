package unitRentalMovie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import rentalMovie.*;

public class CustomerTest2 {

	private Movie m;
	private Rental r;
	private Customer c;

	public static final String res = "Rental Record for Jean\n"
			+ "\tStarWars\t2.0 \n" + "Amount owned is 2.0\n"
			+ "You earned 1 frequent renter points";

	@Before
	public void setUp() throws Exception {
		m = new Movie("StarWars", PriceCode.REGULAR);
		r = new Rental(m, 2);
		c = new Customer("Jean");
		c.addRental(r);
	}

	@Test
	public void testCustomer() {
		assertNotNull(c);
		assertEquals(c.getName(), "Jean");
	}

	@Test
	public void testStatement() {
		System.out.println(c.statement());
		assertEquals(c.statement(), res);
	}

}
