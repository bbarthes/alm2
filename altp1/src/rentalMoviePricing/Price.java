package rentalMoviePricing;

public interface Price {
	
	public double getPrice(int daysRented);
	
	public int getRenterPoints(int daysRented);

	public Price clone();
	

}
