package rentalMovieOutput;


public class Rental {

	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	private double getPriceMovie(double priceloc,double penalty, double bordertime)
	{
		double  res =0;

		res += priceloc;
		if (_daysRented > bordertime) {
			res += (_daysRented - bordertime) * penalty;
		}

		return res;
	}

	public double getPrice()
	{
		double priceloc = 0.0, penalty =0.0,  bordertime =0.0;

		switch (_movie.getPriceCode()) {
		case Movie.REGULAR:
			priceloc =2;
			penalty =1.5;
			bordertime =  2;
			break;
		case Movie.NEW_RELEASE:
			priceloc =0;
			penalty =3;
			bordertime=0;
			break;
		case Movie.CHILDREN:
			priceloc =1.5;
			penalty =1.5;
			bordertime = 3;
			break;
		}

		return getPriceMovie(priceloc, penalty,  bordertime);
	}

	public int getRenterPoints()
	{
		int frequentRenterPoints =1;
		if ((_movie.getPriceCode() == Movie.NEW_RELEASE) && (_daysRented > 1)) {
			frequentRenterPoints++;
		}
		return frequentRenterPoints;
	}

	public String toString()
	{
		return "\t" + _movie.getTitle() + "\t"+ String.valueOf(this.getPrice()) ;
	}
}
