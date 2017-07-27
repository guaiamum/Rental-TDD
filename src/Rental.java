import java.util.ArrayList;

public class Rental {
	public ArrayList<Movie> movies;
	
	public Rental() {
		this.movies = new ArrayList<Movie>();
	}
	
	public int getPoints(){
		int total = 0;
		for(Movie m : movies) {
			total += m.getPoints();
		}
		return total;
	}

	public int getRentalPrice() {
		int totalPrice = 0;
		for(Movie m : movies) {
			totalPrice += m.getPrice();
		}
		return totalPrice;
	}
	
}
