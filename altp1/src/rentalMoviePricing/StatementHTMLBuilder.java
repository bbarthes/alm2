package rentalMoviePricing;

import java.util.Vector;

public class StatementHTMLBuilder implements StatementBuilder{

	private String name;
	private double price;
	private int renterPoint;
	private Vector<Tuple> movies;
	
	
	
	
	public StatementHTMLBuilder() {
		movies = new Vector<>();
	}

	@Override
	public void setTitle(String name) {
		
		this.name = name;
		
	}

	@Override
	public void addMovie(String name, double price) {
		movies.add(new Tuple(name, price));
		
	}

	@Override
	public void setTotalPrice(double price) {
		this.price= price;
		
	}

	@Override
	public void setTotalRenterPoint(int points) {
		this.renterPoint = points;
	}
	
	public String getStatement(){
		StringBuffer html = new StringBuffer();
		html.append("<article> <head> Rental Record for ");
		html.append(this.name);
		html.append("</head>");
		for(Tuple t : movies)
		{
			html.append("<section>");
			html.append(t.getName());
			html.append("&nbsp");
			html.append(t.getPrice());
			html.append("</section>");
		}
		html.append("<footer>");
		html.append("Amount owned is ");
		html.append(this.price);
		html.append("</br>You earned ");
		html.append(this.renterPoint);
		html.append(" frequent renter points");
		html.append("</footer>");
		html.append("</article>");
		return html.toString();
	}

}
