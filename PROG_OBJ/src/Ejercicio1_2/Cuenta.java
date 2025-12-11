package Ejercicio1_2;

import java.util.Scanner;

class Cuenta {

	String titular;
	double cantidad;
	//Método constructor:
	//ES UN MÉTODO QUE SE EJECUTA CUANDO SE INSTANCIA EL OBJETO
	//ES OBLIGATORIO QUE SE LLAME IGUAL QUE LA CLASE(OBLIGATORIO)
	Cuenta(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		titular = scan.nextLine();
		System.out.println("Ingrese el dinero que tiene");
		cantidad = scan.nextDouble();
		
	}
	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	void ingresar(double ingreso) {
		if(ingreso>0) {
			cantidad+=ingreso;
			System.out.println(cantidad);
		}
	}
	void retirar(double retiro) {
		cantidad-=retiro;
		if(cantidad<0) {
			cantidad = 0;
		}
		System.out.println(cantidad);
	}
}
