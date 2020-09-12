/**
 * Class (blueprint) of empty collection exception
 * 
 * @author ITSC 2214
 *
 * @version 1.0
 */

class EmptyCollectionException extends Exception {

	public EmptyCollectionException() {
		System.out.println("Structure is empty.");
	}

	public EmptyCollectionException(String textMsg) {
		System.out.println(textMsg);
	}
}
