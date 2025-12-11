package Ejercicio1_3;

class Cubo {
	
	double lado;
	
	double devolverSuperficie(double lado) {
		double superficie = 6*(lado*lado);
		return superficie;
	}
	double devolverVolumen(double lado) {
		double volumen = lado*lado*lado;
		return volumen;
	}
}
