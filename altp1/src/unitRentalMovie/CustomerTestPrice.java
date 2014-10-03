package unitRentalMovie;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import rentalMoviePricing.*;

public class CustomerTestPrice {

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
		Movie mov;
		tp1_original.Movie movOld;
		Rental ren;
		tp1_original.Rental renOld;
		
		for(int i =0; i<= 10; i++){
			System.out.println(this.cus.statement());
			assertEquals(this.oldCus.statement(),this.cus.statement());

			mov = new Movie("petit poney", new ChildrenPrice());
			movOld = new tp1_original.Movie("petit poney", 2);
			ren = new Rental(mov, i);
			renOld = new tp1_original.Rental(movOld, i);
			this.cus.addRental(ren);
			this.oldCus.addRental(renOld);
			
			mov = new Movie("petit poney", new NewReleasePrice());
			movOld = new tp1_original.Movie("petit poney", 1);
			ren = new Rental(mov, i);
			renOld = new tp1_original.Rental(movOld, i);
			this.cus.addRental(ren);
			this.oldCus.addRental(renOld);
			
			mov = new Movie("petit poney", new RegularPrice());
			movOld = new tp1_original.Movie("petit poney", 0);
			ren = new Rental(mov, i);
			renOld = new tp1_original.Rental(movOld, i);
			
			this.cus.addRental(ren);
			this.oldCus.addRental(renOld);
		}
	}

}


