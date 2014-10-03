package rentalMoviePricing;

public abstract class StandarPrice implements Price {

	protected double priceloc;
	protected double penalty;
	protected double bordertime;

	protected StandarPrice(double priceloc, double penalty, double bordertime) {
		this.priceloc = priceloc;
		this.penalty = penalty;
		this.bordertime = bordertime;
	}

	@Override
	public double getPrice(int daysRented)
	{
		double  res =0;

		res += priceloc;
		if (daysRented > bordertime) {
			res += (daysRented - bordertime) * penalty;
		}

		return res;
	}

	@Override
	public int getRenterPoints(int daysRented)
	{
		return 1;
	}
	
	@Override
	public Price clone()
	{
		return this;
	}
	
	/*protected double calculPriceMovie(double priceloc,double penalty, double bordertime,int daysRented)
	{
		double  res =0;

		res += priceloc;
		if (daysRented > bordertime) {
			res += (daysRented - bordertime) * penalty;
		}

		return res;
	}*/

	/*public int getRenterPoints()
	{
		int frequentRenterPoints =1;
		if ((_movie.getPriceCode() == PriceCode.NEW_RELEASE) && (_daysRented > 1)) {
			frequentRenterPoints++;
		}
		return frequentRenterPoints;
	}*/

}
