import junit.framework.TestCase;

public class MyVideoStoreTest extends TestCase {
	
	public void testRental() {
		
	}
	
	public void testRentalPoints() {
		Rental rental1 = new Rental();
		
		rental1.movies.add(new Movie(10, 0));
		rental1.movies.add(new Movie(6, 0));
		
		assertEquals(16, rental1.getPoints());		
	}
	
	public void testCustomerFidelityPoints() {
		Rental rental1 = new Rental();
		rental1.movies.add(new Movie(15, 0));
		
		
		Customer customer = new Customer("Joséfalo");
		customer.myRentals.add(rental1);
		
		assertEquals(15,customer.getAllFidelityPoints());		
	}
	
	public void testMoviePoints() {
		Movie movie = new Movie(14, 0);
		
		assertEquals(14, movie.getPoints());
	}
	
	public void testMoviePrice() {
		Movie movie = new Movie(12,10);
		
		assertEquals(10, movie.getPrice());
	}
	
	public void testTotalRentalPrice() {
		Rental rental1 = new Rental();
		rental1.movies.add(new Movie(12,10));
		rental1.movies.add(new Movie(11,9));
		rental1.movies.add(new Movie(10,8));
		
		assertEquals(27, rental1.getRentalPrice());
	}
	
	public void testMovieCategory() {
		Movie movie = new Movie(12, 2, "terror");
		
		assertEquals("terror", movie.getCategory());
	}
	
	/*public void testRentalStatement() {
		final String string = MyRentalStatement
				.makeMyRentalStatement("Rental Record for Customer Name\n" + 
						"\tRegular 1\t2.0\n" +
						"\tRegular 2\t2.0\n" +
						"\tRegular 3\t3.5\n" +
						"You owed 7.5\n" +
						"You earned 3 frequent renter points\n");
		
		assertEquals("Rental Record for Customer Name\n" + 
						"\tRegular 1\t2.0\n" +
						"\tRegular 2\t2.0\n" +
						"\tRegular 3\t3.5\n" +
						"You owed 7.5\n" +
						"You earned 3 frequent renter points\n",
						string);
	}*/
	
}
