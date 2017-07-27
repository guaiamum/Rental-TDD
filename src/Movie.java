
public class Movie {
	
	private String title;
	private int points;
	private int price;
	private String category; 
	
	public Movie (int points, int price) {
		this.points = points;
		this.price = price;
		this.category = "";
	}
	
	public Movie (int points, int price, String category) {
		this.points = points;
		this.price = price;
		this.category = category;
	}
	
	public Movie (int points, int price, String category, String title) {
		this.points = points;
		this.price = price;
		this.category = category;
		this.title = title;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public int getPrice() {
		return this.price;
	}

	public String getCategory() {
		return this.category;
	}
}
