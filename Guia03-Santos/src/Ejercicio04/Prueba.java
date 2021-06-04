package Ejercicio04;

import Ejercicio03.Escala;
import Ejercicio03.Temperatura;

public class Prueba {

	public static void main(String[] args) {

		Registro r1 = new Registro("DENVER");
		Registro r2 = new Registro("SARMIENTO");
		Registro r3 = new Registro("SANTA FE");
		
		Temperatura t1 = new Temperatura(13, Escala.CELCIUS);
		Temperatura t2 = new Temperatura(30, Escala.CELCIUS);
		Temperatura t3 = new Temperatura(100, Escala.CELCIUS);
		Temperatura t4 = new Temperatura(2, Escala.CELCIUS);
		Temperatura t5 = new Temperatura(10, Escala.CELCIUS);
		Temperatura t6 = new Temperatura(150, Escala.CELCIUS);
		Temperatura t7 = new Temperatura(7, Escala.CELCIUS);

		Temperatura t8 = new Temperatura(55, Escala.CELCIUS);
		Temperatura t9 = new Temperatura(9, Escala.FAHRENHEIT);
		Temperatura t10 = new Temperatura(234, Escala.FAHRENHEIT);
	
		r3.agregar(t1);
		r3.agregar(t2);
		r3.agregar(t3);
		r3.agregar(t4);
		r3.agregar(t5);
		r3.agregar(t6);
		r3.agregar(t7);
		
		r2.agregar(t8);
		r2.agregar(t9);
		r2.agregar(t10);
		
		System.out.println(r1.getCiudad());
		System.out.println("---------------------------------------------------------");
		r2.imprimir();
		System.out.println("---------------------------------------------------------");
		System.out.println("MÁXIMO: " + r3.maximo());
		
		
	}

}
