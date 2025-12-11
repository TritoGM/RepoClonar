package Ejercicio1_3;

class Circulo {
	
	double radio;
	
	double devolverPerimetro(double radio) {
		double perimetro = (2*3.14)*radio;
		return perimetro;
	}
	double devolverArea(double radio) {
		double area = 3.14*(radio*radio);
		return area;
	}
	
}
