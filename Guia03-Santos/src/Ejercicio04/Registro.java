package Ejercicio04;

import Ejercicio03.Escala;
import Ejercicio03.Temperatura;

public class Registro {

	private String ciudad;
	private Temperatura[]  historico;
	private final int capacidadMax = 15;
	private int cantidad_historicos;
	
	public Registro() {
		super();
		this.ciudad = "-";
		this.historico = new Temperatura[capacidadMax];
		this.cantidad_historicos=0;
	}
	
	public Registro(String ciudad) {
		super();
		this.ciudad = ciudad;
		this.historico = new Temperatura[capacidadMax];
		this.cantidad_historicos=0;
		
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Temperatura[] getHistorico() {
		return historico;
	}

	public void setHistorico(Temperatura[] historico) {
		this.historico = historico;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}
	
	public void imprimir() {
		System.out.println("TEMPERATURA EN " + this.getCiudad());
		
		for (int i=0; i<this.cantidad_historicos; i++) {
			Temperatura t= this.getHistorico()[i];
			if(t.getEscala().name() == Escala.CELCIUS.toString()) {
				System.out.println(t.getGrados() + "°C");
			}else {
				System.out.println(t.getGrados() + "°F");
			}
		}
	}
	
	public void agregar(Temperatura t) {
		if(this.cantidad_historicos < 15) {
			this.getHistorico()[this.cantidad_historicos] = t;
			this.cantidad_historicos ++;

		}
		
	}
	
	
	public Temperatura mediaAsCelcius() {
		
		double grados;
		double suma_grados=0;
		for (int i=0; i<this.cantidad_historicos ; i++) {
			
				grados= this.getHistorico()[i].asCelcius() ;
			
			
			suma_grados += grados;
		}
		
		Temperatura t = new Temperatura();
		t.setEscala(Escala.CELCIUS);
		t.setGrados(suma_grados / this.cantidad_historicos);
		
		return t;
		
	}
	
	public Temperatura mediaAsFareheint() {
		
		double grados;
		double suma_grados=0;
		for (int i=0; i<this.cantidad_historicos ; i++) {
			
				grados= this.getHistorico()[i].asFahrenheit();
			
			
			suma_grados += grados;
		}
		
		Temperatura t = new Temperatura();
		t.setEscala(Escala.FAHRENHEIT);
		t.setGrados(suma_grados / this.cantidad_historicos);
		
		return t;
		
	}
	
	public double maximo () {
		
		double maximo = compararMax(0,0);
		return maximo;
	}
	
	public double compararMax(int indice, double maxActual) {
		
		if (indice < this.cantidad_historicos) {
			
			
			if(this.getHistorico()[indice].asCelcius() >= maxActual) {
				maxActual = this.getHistorico()[indice].asCelcius();
			}
			return compararMax(indice + 1, maxActual);
		}else {
		return maxActual;
		}
	}
	
	public int compareTo (Temperatura t1 ,Temperatura t2 ) {
		 double a= t1.asCelcius();
		 double b= t2.asCelcius();
		
		if(a>b) {
			return 1;
		}else {
			if(a<b) {
				return -1;
			}else {return 0;}
		}
	}
	
	
}
