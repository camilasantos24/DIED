package Ejercicio03;

public class Temperatura {

	private double grados; 
	private Escala escala;
	
	
	
	public Temperatura(double grados, Escala escala) {
		super();
		this.grados = grados;
		this.escala = escala;
	}
	
	public Temperatura() {
		this.grados=0;
		this.escala= Escala.CELCIUS;
	}
	
	public double getGrados() {
		return grados;
	}
	public void setGrados(double grados) {
		this.grados = grados;
	}
	public Escala getEscala() {
		return escala;
	}
	public void setEscala(Escala escala) {
		this.escala = escala;
	}
	
	
	public String toString() {
		String resultado = null;
		String esca;
		
		if (this.getEscala().name() == Escala.CELCIUS.toString()) {
			esca= "C°";
		}else {
			esca= "F°";
		}
		
		resultado = this.getGrados() + " " + esca ;
		
		return resultado;
	}
	
	public double asCelcius () {
		double res;
		
		if(this.getEscala().name() == Escala.CELCIUS.toString()) {
			res = this.getGrados();
		}else {
			res = ((this.getGrados()-32)*(5))/9;			
		}
		
		return res;
		
	}
	
	public double asFahrenheit() {
		double res;
		
		if(this.getEscala().name() == Escala.CELCIUS.toString()) {
			res = ((this.getGrados()*9)/5)+32;			
			
		}else {
			res = this.getGrados();
		}
		
		return res;
	}
	
	public void aumentar(Temperatura t) {
		double temp_final;
		if(this.getEscala().name() == t.escala.name()) {
			temp_final = this.getGrados() + t.getGrados() ;
			
		}else {
			if (this.getEscala().name() == Escala.CELCIUS.toString()) {
				temp_final= this.getGrados() + t.asCelcius();
			}else {
				temp_final= this.getGrados() + t.asFahrenheit() ;
			}
		}
		
		this.setGrados(temp_final);
	}
	
	public void disminuir(Temperatura t) {
		double temp_final;
		if(this.getEscala().name() == t.escala.name()) {
			temp_final = this.getGrados() - t.getGrados() ;
			
		}else {
			if (this.getEscala().name() == Escala.CELCIUS.toString()) {
				temp_final= this.getGrados() - t.asCelcius();
			}else {
				temp_final= this.getGrados() - t.asFahrenheit() ;
			}
		}
		
		this.setGrados(temp_final);
	}
	
}
