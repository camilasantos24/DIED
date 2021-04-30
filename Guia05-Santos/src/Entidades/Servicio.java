package Entidades;

public abstract class Servicio implements Contratable {

	private Trabajador trabajador;
	private boolean es_urgente;
	private Oficio oficio;

	
	public Servicio(boolean es_urgente) {
		super();
		this.es_urgente = es_urgente;
	}
	
	public Servicio() {
	}
	

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	public boolean isEs_urgente() {
		return es_urgente;
	}

	public void setEs_urgente(boolean es_urgente) {
		this.es_urgente = es_urgente;
	}

	public Oficio getOficio() {
		return oficio;
	}

	public void setOficio(Oficio oficio) {
		this.oficio = oficio;
	}

	
	
	
	
	
}
