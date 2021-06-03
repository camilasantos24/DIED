package Pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class MAIN implements Comparator{


	
	
	public static void main(String[] args) {
		 
		Empleado e1 = new Empleado("Martin",1000.0);
		Empleado e2 = new Empleado("Marta",1500.0);
		Empleado e3 = new Empleado("Mari",460.0);
		Empleado e4 = new Empleado("Fran",500.0);
		Empleado e5 = new Empleado("Camila",700.0);
		
		List<Empleado> emps = new ArrayList<Empleado>();
		
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		for (Empleado e : emps) {
			System.out.println(e.getNombre() + " - " + e.getSalario());
		}

		
		emps.sort((t1, t2) -> Double.compare( t1.getSalario(), t2.getSalario()));
		
		
		for (Empleado e : emps) {
			System.out.println(e.getNombre() + " - " + e.getSalario());
		}
		
		
		/*Consumer<Empleado> aumento1 = (emp)-> {emp.setSalario(emp.getSalario() * 1.1);};
		Consumer<Empleado> aumento2 = (emp) -> {emp.setSalario(emp.getSalario() * 1.2);};
		 
		 //aumento1.accept(e1);
		// aumento2.accept(e2);
		 aumento1.andThen(aumento2).accept(e2);
		 System.out.println(e1.getSalario()); // 1100
		 System.out.println(e2.getSalario()); // 660
		 
		 */
		
	}
	
	
	public static void esnull(List<Persona> personas) {
		Optional<Persona> p;
		
		for(int i=0; i<personas.size(); i++) {
			p= Optional.ofNullable(personas.get(i));
			
				System.out.println(p.isPresent());
			}

	}

	

	@Override
	public int compare(Object arg0, Object arg1) {
	
		return 0;
	}
	
	
	}


