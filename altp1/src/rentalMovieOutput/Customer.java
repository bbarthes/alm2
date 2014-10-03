package rentalMovieOutput;


import java.util.Vector;

public class Customer {

	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();

	public Customer(String name) {
		_name = name;
	}

	public void addRental(Rental rental) {
		_rentals.addElement(rental);
	}

	public String getName() {
		return _name;
	}

	public double getTotalPrice(){
		double total = 0;
		for (Rental rent : _rentals) {
			total += rent.getPrice(); 
		}
		return total;
	}

	public int getTotalRenterPoints()
	{
		int total = 0;
		for (Rental rent : _rentals) {
			total += rent.getRenterPoints();
		}
		return total;
	}

	public void statement(StatementBuilder st) {
		st.setTitle(getName());
		for (Rental rent : _rentals) {
			st.addMovie(rent.getMovie().getTitle(), rent.getPrice());
		}
		st.setTotalPrice(getTotalPrice());
		st.setTotalRenterPoint(getTotalRenterPoints());
	}
	
	public String statement() {
		
		StatementTextBuilder sb = new StatementTextBuilder();
		
		statement(sb);

		return sb.getStatement();


	}
}
