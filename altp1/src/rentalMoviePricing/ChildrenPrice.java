package rentalMoviePricing;

public class ChildrenPrice implements Price{

	@Override
	public double getPrice(int daysRented) {
		double result = 1.5;
		if(daysRented > 3)
		    result += (daysRented-3) * 1.5;
		return result;
	}

	@Override
	public int getRenterPoints(int daysRented) {
		return 1;
	}
	
	

}
