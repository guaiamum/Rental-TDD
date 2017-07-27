import java.util.ArrayList;

public class Customer {
	private String name;
	public ArrayList<Rental> myRentals;
	
	public Customer(String name) {
		this.name = name;
		this.myRentals = new ArrayList<Rental>();
	}

	public int getAllFidelityPoints() {
		int points = 0;
		for(Rental r : this.myRentals) {
			points += r.getPoints();
		}
		
		return points;
	}

}
