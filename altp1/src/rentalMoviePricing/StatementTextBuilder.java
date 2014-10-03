package rentalMoviePricing;

public class StatementTextBuilder implements StatementBuilder{

	
	private StringBuffer statement;
	
	
	public StatementTextBuilder() {
		statement = new StringBuffer();
	}

	@Override
	public void setTitle(String name) {
		statement.append("Rental Record for ");
		statement.append(name);
		statement.append("\n");
	}

	@Override
	public void addMovie(String name, double price) {
		// TODO Auto-generated method stub
		statement.append("\t");
		statement.append(name);
		statement.append("\t");
		statement.append(price);
		statement.append(" \n");
		
	}

	@Override
	public void setTotalPrice(double price) {
		
		statement.append("Amount owned is ");
		statement.append(price);
		statement.append("\n");
		
	}

	@Override
	public void setTotalRenterPoint(int points) {
		statement.append("You earned ");
		statement.append(points);
		statement.append(" frequent renter points");
	}
	
	public String getStatement(){
		String st = statement.toString();
		//statement = new StringBuffer();
		return st;
	}
	
	

	
}
