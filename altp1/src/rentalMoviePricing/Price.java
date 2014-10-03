package rentalMoviePricing;

public interface Price {
	
	abstract double getPrice(int daysRented);
	
	abstract int getRenterPoints(int daysRented);
	

}
