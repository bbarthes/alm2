package rentalMovieOutput;


import java.util.Enumeration;
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

	public int getRenterPoints()
	{
		int frequentRenterPoints =0;
		Enumeration<Rental> rentals = _rentals.elements();

		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			frequentRenterPoints += each.getRenterPoints();
		}
		return frequentRenterPoints;
	}



	public double getTotalPrice(){
		double totalAmount = 0;

		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			totalAmount += each.getPrice();

		}
		return totalAmount;
	}

	public int getTotalRenterPoints()
	{
		int totalRT = 0;

		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			totalRT += each.getRenterPoints();

		}
		return totalRT;
	}

	public double getPrice(Rental rent, double sum){
		System.out.println("toto");
		switch (rent.getMovie().getPriceCode()) {
		case Movie.REGULAR:
			sum += 2;
			if (rent.getDaysRented() > 2) {
				sum += (rent.getDaysRented() - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			sum += rent.getDaysRented() * 3;
			break;
		case Movie.CHILDREN:
			sum += 1.5;
			if (rent.getDaysRented() > 3)
				sum += (rent.getDaysRented() - 3) * 1.5;
			break;
		}
		return sum;
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
