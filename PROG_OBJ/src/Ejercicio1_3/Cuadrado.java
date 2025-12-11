package Ejercicio1_3;

public class Cuadrado {
	double lado;
	
	double devolverPerimetro(double lado) {
		double perimetro = lado*4;
		return perimetro;
	}
	double devolverArea(double lado) {
		double area = lado*lado;
		return area;
	}
}
