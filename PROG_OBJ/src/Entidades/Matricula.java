package Entidades;
	

class Matricula {
	
	
	int codigo;
	String descripcion;
	double cantidad;
	
	// SI UN METODO NECESITA DATOS AJENOS AL OBJETO PARA OPERAR HAY QUE PASARSELO COMO PARAMETRO
	double cantidadConIVA(int iva) {
		double result = cantidad + cantidad*iva/100;
		return result;
	}
}
