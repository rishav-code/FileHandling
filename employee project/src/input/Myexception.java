package input;

/*
 * Class contains custom collection
 * Try catch is used to catch  the thrown exception
 */
public class Myexception extends Exception {

	public Myexception(String message) {
		System.out.println(message);
		try {
		} catch (Exception e) {
			System.out.println("Please try Again");
		}
	}
}
