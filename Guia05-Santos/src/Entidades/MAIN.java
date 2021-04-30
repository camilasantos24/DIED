package Entidades;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MAIN {

	public static void main(String[] args) {

	Calendar f1 = Calendar.getInstance();
	Calendar f2 = Calendar.getInstance();
		
	f1.set(Calendar.YEAR, 2021);
	f1.set(Calendar.MONTH, 04);
	f1.set(Calendar.DAY_OF_MONTH, 6);
	
	f2.set(Calendar.YEAR, 2021);
	f2.set(Calendar.MONTH, 04);
	f2.set(Calendar.DAY_OF_MONTH, 30);
	
	Herramienta h= new Herramienta("Alicate", 250);
	Alquiler alq=  new Alquiler(h);
	alq.setDia_inicio(f1);
	alq.setDia_fin(f2);
	
	System.out.println(alq.enMora());
	
	Oficio o= new Oficio ("Gasista");
	Oficio o1= new Oficio ("Plomero");
	Oficio o2= new Oficio ("Albañil");
	
	ServicioEstandar s1= new ServicioEstandar();
	s1.setOficio(o);
	s1.costo_fijo_reparafix= 500;
	
	Alquiler a1= new Alquiler(h);
	Alquiler a2= new Alquiler(h);
	
	Usuario u1= new Usuario("Roberto");
	
	try {
		u1.contratar(a1);
		System.out.println("Contratado");

	} catch (ExcepcionAlquiler e2) {
		e2.printStackTrace();
	}
	try {
		u1.contratar(a2);
		System.out.println("Contratado");

	} catch (ExcepcionAlquiler e2) {
		e2.printStackTrace();
	}
	try {
		u1.contratar(s1);
		System.out.println("Contratado");
	} catch (ExcepcionAlquiler e1) {
		e1.printStackTrace();
	}
	
	
	
	
	Trabajador t = new Trabajador("Raul", "sjhcka", o, 100, 120);
	Trabajo tr1= new Trabajo(s1, o);
	Trabajo tr2= new Trabajo(s1, o);
	
	try {
		t.agregar_tarea(tr1);
		System.out.println("Se agregó");
	} catch (ExcepcionOficio e) {
		e.printStackTrace();
	} catch (ExcepcionAgendaOcupada e) {
		e.printStackTrace();
	}
	
	tr1.setFecha(f2);
	try {
		t.agregar_tarea(tr2);
		System.out.println("Se agregó");
	} catch (ExcepcionOficio e) {
		e.printStackTrace();
	} catch (ExcepcionAgendaOcupada e) {
		e.printStackTrace();
	}
	
	System.out.println(tr1.finalizado());
	
	}
	
	public static void retornar_clase (Servicio s) {
		System.out.println(s.getClass());
		
		if(s.getClass().equals(ServicioEstandar.class)) {
			System.out.println("si");
		}else {
			System.out.println("no");

		}
		
	}

}
