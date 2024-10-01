package handling3.exceptions;

//uncheked Exception
public class InvalidDateException extends RuntimeException {
	public InvalidDateException() {
	}

	public InvalidDateException(String message) {
		super(message);
	}

}
