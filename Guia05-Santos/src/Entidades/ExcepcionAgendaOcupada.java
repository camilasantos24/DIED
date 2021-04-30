package Entidades;

public class ExcepcionAgendaOcupada extends Exception {

	public ExcepcionAgendaOcupada() {
		super();
	}

	public ExcepcionAgendaOcupada(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ExcepcionAgendaOcupada(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcepcionAgendaOcupada(String message) {
		super(message);
	}

	public ExcepcionAgendaOcupada(Throwable cause) {
		super(cause);
	}

	
	
}
