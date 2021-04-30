package Entidades;

public class ServicioPersonalizado extends Servicio {

	public float costo_presupuestado;
	public float costo_materiales;
	public float costo_transporte;
	
	
	@Override
	public float calcular_costo() {

		
		
		float costo_fijo= costo_presupuestado +costo_materiales + costo_transporte; 
		
		if(this.isEs_urgente() == true) {
			float monto_urgencia= retornar_valor_porcentaje(50, costo_fijo);
			return costo_fijo + monto_urgencia;
		}else {
			return costo_fijo;
		}
		
	}
	
	public  float retornar_valor_porcentaje(float porcent, float costoFijo) {
		return (porcent * costoFijo)/100;
	}
}
