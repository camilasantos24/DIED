package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nombre;
	private List<Contratable> contratables;
	
	public Usuario(String nombre, List<Contratable> contratables) {
		super();
		this.nombre = nombre;
		this.contratables = contratables;
	}

	public Usuario(String nombre) {
		super();
		this.contratables= new ArrayList();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Contratable> getContratables() {
		return contratables;
	}

	public void setContratables(List<Contratable> contratables) {
		this.contratables = contratables;
	}
	
	
	public void contratar(Contratable c) throws ExcepcionAlquiler {
		
		int cantidad_alquileres=0;
		boolean habilitado=true;
		
		int i=0;
		while(i<this.contratables.size() && habilitado ==true) {
			
			if(contratables.get(i).getClass().equals(Alquiler.class)) {
				if(((Alquiler)contratables.get(i)).getDia_real() ==null) {
					cantidad_alquileres ++ ;
				}
			}
			
			if(cantidad_alquileres ==2) {
				habilitado=false;
			}
			
			i++;
		}
		
		if(habilitado==true) {
			contratables.add(c);
		}else {
			ExcepcionAlquiler e= new ExcepcionAlquiler("AlquilerNoEntregadoExcepcion");
			throw e;
		}
		
	}
	
}
