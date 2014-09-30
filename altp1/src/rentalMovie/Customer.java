package rentalMovie;


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
	/* int frequentRenterPoints = 0;
	Enumeration rentals = _rentals.elements();
	String result = "Rental Record for " + getName() + "\n";
	while (rentals.hasMoreElements()) {
		double thisAmount = 0;
		Rental each = (Rental) rentals.nextElement();
		//			thisAmount = each.getPrice(each, thisAmount);

		frequentRenterPoints++;
		if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
				&& (each.getDaysRented() > 1)) {
			frequentRenterPoints++;
		}
	}
	 */

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


	public String statement() {

		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
				while (rentals.hasMoreElements()) {
					Rental each=(Rental) rentals.nextElement();
					result += "\t" + each.getMovie().getTitle() + "\t"
							+ String.valueOf(each.getPrice()) + " \n";
				}
				result += "Amount owned is " + String.valueOf(this.getTotalPrice()) + "\n";
				result += "You earned " + String.valueOf(this.getTotalRenterPoints())
						+ " frequent renter points";
		return result;

	}
}
