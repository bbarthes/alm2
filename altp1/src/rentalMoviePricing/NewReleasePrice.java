package rentalMoviePricing;

public class NewReleasePrice implements Price{

	@Override
	public double getPrice(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public	int getRenterPoints(int daysRented) {
		if (daysRented > 1)
			return 2;
		return 1;
	}

}
