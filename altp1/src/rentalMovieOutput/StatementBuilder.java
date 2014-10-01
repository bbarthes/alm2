package rentalMovieOutput;

public interface StatementBuilder {


	public void setTitle(String name);
	public void addMovie(String name, double price);
	public void setTotalPrice(double price);
	public void setTotalRenterPoint(int points);


}
