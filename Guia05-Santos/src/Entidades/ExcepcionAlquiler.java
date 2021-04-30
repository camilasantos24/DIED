package Entidades;

public class ExcepcionAlquiler extends Exception {

	public ExcepcionAlquiler() {
		super();
	}

	public ExcepcionAlquiler(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ExcepcionAlquiler(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcepcionAlquiler(String message) {
		super(message);
	}

	public ExcepcionAlquiler(Throwable cause) {
		super(cause);
	}

	
	
}
