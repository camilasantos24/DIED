package Entidades;

import java.util.Calendar;
import java.util.Date;

public class Trabajo implements Finalizar{

	private Calendar fecha_fin;
	private Oficio oficio;
	
	
	public Trabajo(Servicio servicio, Oficio oficio) {
		super();
		this.fecha_fin = null;
		this.oficio = oficio;
	}



	public Calendar getFecha() {
		return fecha_fin;
	}


	public void setFecha(Calendar fecha) {
		this.fecha_fin = fecha;
	}


	public Oficio getOficio() {
		return oficio;
	}


	public void setOficio(Oficio oficio) {
		this.oficio = oficio;
	}



	@Override
	public boolean finalizado() {
		if(fecha_fin !=null) {
			return true;
		}else {

		return false;
		}
	}
	
	
	
	
}
