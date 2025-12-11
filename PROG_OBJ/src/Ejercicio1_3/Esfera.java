package Ejercicio1_3;

public class Esfera {
	double radio;
	
	double devolverSuperficie(double radio) {
		double superficie = 4*3.14*(radio*radio);
		return superficie;
	}
	double devolverVolumen(double radio) {
		double volumen = (4/3)*3.14*(radio*radio*radio);
		return volumen;
	}
}
