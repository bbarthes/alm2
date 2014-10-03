package rentalMoviePricing;

public class NewReleasePrice extends StandarPrice{

	public NewReleasePrice() {
		super(0, 3, 0);
	}
	@Override
	public	int getRenterPoints(int daysRented) {
		if (daysRented > 1)
			return 2;
		return 1;
	}

}
