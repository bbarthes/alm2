package rts.exception;

public class ErrorDoctorWho extends Exception {

	private static final long serialVersionUID = 1L;

	public ErrorDoctorWho() {
	}

	public ErrorDoctorWho(String message) {
		super(message);
	}
	public  ErrorDoctorWho(int val) {
		super(Integer.toString(val));

	}

}
