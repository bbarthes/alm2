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