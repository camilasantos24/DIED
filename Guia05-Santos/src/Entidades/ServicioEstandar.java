package Entidades;

public class ServicioEstandar extends Servicio {

	public float costo_fijo_reparafix;
	
	
	
	@Override
	public float calcular_costo() {
		
		float costo_fijo= costo_fijo_reparafix;
		float porcentaje_comision= this.getTrabajador().getPorcentaje_comision();
		float monto_comision= retornar_valor_porcentaje(porcentaje_comision, costo_fijo);
		
		if(this.isEs_urgente() == true) {
			float monto_urgencia= retornar_valor_porcentaje(50, costo_fijo);
			return costo_fijo + monto_comision + monto_urgencia ;
		}else {
			return costo_fijo + monto_comision;
		}	
	}
	
	
	public  float retornar_valor_porcentaje(float porcent, float costoFijo) {
		return (porcent * costoFijo)/100;
	}
	
}
