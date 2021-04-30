package Entidades;

public class Herramienta {

	private String nombre;
	private float costo_por_dia;
	
	
	
	public Herramienta(String nombre, float costo_por_dia) {
		super();
		this.nombre = nombre;
		this.costo_por_dia = costo_por_dia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getCosto_por_dia() {
		return costo_por_dia;
	}
	public void setCosto_por_dia(float costo_por_dia) {
		this.costo_por_dia = costo_por_dia;
	}
	
	
	
}
