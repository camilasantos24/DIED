package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private String nombre;
	private String correo;
	private Oficio oficio;
	private float costo_por_hora;
	private float porcentaje_comision;
	private List<Trabajo> trabajos;
	
	
	public Trabajador(String nombre, String correo, Oficio oficio, float costo_por_hora, float porcentaje_comision) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.oficio = oficio;
		this.costo_por_hora = costo_por_hora;
		this.porcentaje_comision = porcentaje_comision;
		this.trabajos = new ArrayList();
	}
	
	public Trabajador() {
		
	}

	//_-------------------------------------------------------------------------------------------------------------
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Oficio getOficio() {
		return oficio;
	}

	public void setOficio(Oficio oficio) {
		this.oficio = oficio;
	}

	public float getCosto_por_hora() {
		return costo_por_hora;
	}

	public void setCosto_por_hora(float costo_por_hora) {
		this.costo_por_hora = costo_por_hora;
	}

	public float getPorcentaje_comision() {
		return porcentaje_comision;
	}

	public void setPorcentaje_comision(float porcentaje_comision) {
		this.porcentaje_comision = porcentaje_comision;
	}

	public List<Trabajo> getTrabajos() {
		return trabajos;
	}

	public void setTrabajos(List<Trabajo> trabajos) {
		this.trabajos = trabajos;
	}
	
	//_--------------------------------------------------------------------------------------------------------------------

	public void agregar_tarea (Trabajo t) throws ExcepcionOficio, ExcepcionAgendaOcupada {
		
		boolean fecha_ocupada = false;
		int i=0;
		
		while (i<trabajos.size() && fecha_ocupada==false) {
			if(trabajos.get(i).getFecha()==null){
				//si fecha_fin está en null significa que todavia está pendiente 
				fecha_ocupada=true;
			}
			
			i++;
		}
		
		if(fecha_ocupada==false) {
			if(this.getOficio().getOficio() == t.getOficio().getOficio()) {
				trabajos.add(t);
			}else {
				ExcepcionOficio e= new ExcepcionOficio("OficioNoCoincideExcepcion");
				throw e;
			}
		}else {
			ExcepcionAgendaOcupada e1= new ExcepcionAgendaOcupada("AgendaOcupadaExcepcion");
			throw e1;
		}
	}
}
