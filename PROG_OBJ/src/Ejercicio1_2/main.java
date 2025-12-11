package Ejercicio1_2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cuenta cuenta = new Cuenta();
		
		System.out.println("Ingrese su nombre");
		String titular = scan.nextLine();
		System.out.println("Ingrese el dinero que tiene");
		double cantidad = scan.nextDouble();
		int opcion;
		do {
			
			System.out.println("1 para ingresar, 2 para retirar");
			opcion = scan.nextInt();
			switch(opcion) {
			case 1->{
				System.out.println("Cuanto quieres ingresar");
				double ingreso = scan.nextDouble();
				cuenta.ingresar(ingreso);
			}
			case 2->{
				System.out.println("Cuanto quieres retirar");
				double retiro = scan.nextDouble();
				cuenta.retirar(retiro);
			}
				
			default->
				System.out.println("Numero invalido");
			}
		
		}while(opcion == 1 || opcion == 2 && cuenta.cantidad>0);
	}

}
