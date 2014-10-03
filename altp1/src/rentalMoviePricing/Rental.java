package rentalMoviePricing;


public class Rental {

	private Movie _movie;
	private int _daysRented;
	private Price _priceMovie;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
		_priceMovie = movie.getPrice(); 
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	public double getPrice()
	{
		return _priceMovie.getPrice(_daysRented);
	}

	public int getRenterPoints()
	{
		return _priceMovie.getRenterPoints(_daysRented);
	}

}
