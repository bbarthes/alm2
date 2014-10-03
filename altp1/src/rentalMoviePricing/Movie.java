package rentalMoviePricing;


public class Movie {

	private String _title;
	private Price _price;

	public Movie(String title, Price price) {
		_title = title;
		_price = price;
	}

	public Price getPrice() {
		return _price.clone();
	}

	public void setPriceCode(Price price) {
		_price= price;
	}

	public String getTitle() {
		return _title;
	}

}
