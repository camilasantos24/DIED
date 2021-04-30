package Entidades;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alquiler implements Contratable, Finalizar {

	private Herramienta herramienta;
	private Calendar dia_inicio;
	private Calendar dia_fin;
	private Calendar dia_real;
	
	
	public Alquiler(Herramienta h) {
		this.dia_inicio= Calendar.getInstance();
		this.dia_fin= Calendar.getInstance();
		this.dia_real=null;
		this.herramienta= h;
		
	}
	
	
	
	public Herramienta getHerramienta() {
		return herramienta;
	}

	public void setHerramienta(Herramienta herramienta) {
		this.herramienta = herramienta;
	}

	public Calendar getDia_inicio() {
		return dia_inicio;
	}

	public void setDia_inicio(Calendar dia_inicio) {
		this.dia_inicio = dia_inicio;
	}

	public Calendar getDia_fin() {
		return dia_fin;
	}

	public void setDia_fin(Calendar dia_fin) {
		this.dia_fin = dia_fin;
	}

	public Calendar getDia_real() {
		return dia_real;
	}

	public void setDia_real(Calendar dia_real) {
		this.dia_real = dia_real;
	}



	@Override
	public float calcular_costo( ) {

		float costo;
		long cantidad_dias;

		Date fecha_inicio = this.getDia_inicio().getTime();

		if(dia_real == null) {
			
			Calendar fechaActualAUX = new GregorianCalendar();
			Calendar fechaActual= Calendar.getInstance();			
			fechaActual.set(Calendar.YEAR, fechaActualAUX.get(Calendar.YEAR));
			fechaActual.set(Calendar.MONTH, fechaActualAUX.get(Calendar.MONTH)+1);
			fechaActual.set(Calendar.DAY_OF_MONTH, fechaActualAUX.get(Calendar.DATE));
			
			Date fecha_actual = fechaActual.getTime();
			long dif_milis = fecha_actual.getTime() - fecha_inicio.getTime();
			cantidad_dias =dif_milis / (1000 * 60 * 60 * 24);
		
			
		}else {
			Date fecha_real= this.getDia_real().getTime();
			long dif_milis = fecha_real.getTime() - fecha_inicio.getTime();
			cantidad_dias =dif_milis / (1000 * 60 * 60 * 24);
		
		}

		
		costo= this.getHerramienta().getCosto_por_dia() * cantidad_dias;
		return costo;
	}
	
	
	public boolean enMora() {

		if(dia_real == null) {
			Calendar fecha_actual = new GregorianCalendar();
			fecha_actual.set(Calendar.MONTH, fecha_actual.get(Calendar.MONTH)+1);
			
			
			
			if(fecha_actual.getTime().after(dia_fin.getTime())) {
				return true;
			}else {
				return false;
			}
		}else {
			if(dia_real.getTime().after(dia_fin.getTime())) {
				return true;
			}else {
				return false;
			}
		}
	}



	@Override
	public boolean finalizado() {
		if(this.dia_real !=null) {
			return true;
		}else {
		return false;
		}
	}

}
