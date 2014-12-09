package rts.exception;

public class ErrorHandsFull extends Exception {

	private static final long serialVersionUID = 1L;

	public ErrorHandsFull() {
	}

	public ErrorHandsFull(String message) {
		super(message);
	}
	public  ErrorHandsFull(int val) {
		super(Integer.toString(val));

	}

}
