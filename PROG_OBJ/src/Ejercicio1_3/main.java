package Ejercicio1_3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("Elige una figura");
		System.out.println("(a)Circulo");
		System.out.println("(b)Cuadrado");
		System.out.println("(c)Esfera");
		System.out.println("(d)Cubo");
		System.out.println("(e)Salir");
		
		Scanner scan = new Scanner(System.in);
		String opcion = scan.nextLine();
		
		if(opcion.equals("a")) {
			
			Circulo circulo = new Circulo();
			System.out.println("Introduce el radio");
			double radio = scan.nextDouble();
			
			System.out.println("Perimetro");
			System.out.println(circulo.devolverPerimetro(radio));
			System.out.println("Area");
			System.out.println(circulo.devolverArea(radio));
			
		}else if(opcion.equals("b")) {
			
			Cuadrado cuadrado = new Cuadrado();
			System.out.println("Introduce el lado");
			double lado = scan.nextDouble();
			
			System.out.println("Perimetro");
			System.out.println(cuadrado.devolverPerimetro(lado));
			System.out.println("Area");
			System.out.println(cuadrado.devolverArea(lado));
			
		}else if(opcion.equals("c")){
			
			Esfera esfera = new Esfera();
			System.out.println("Introduce el radio");
			double radio = scan.nextDouble();
			
			System.out.println("Superficie");
			System.out.println(esfera.devolverSuperficie(radio));
			System.out.println("Volumen");
			System.out.println(esfera.devolverVolumen(radio));
			
		}else if(opcion.equals("d")){
			
			Cubo cubo = new Cubo();
			System.out.println("Introduce el lado");
			double lado = scan.nextDouble();
			
			System.out.println("Superficie");
			System.out.println(cubo.devolverSuperficie(lado));
			System.out.println("Volumen");
			System.out.println(cubo.devolverVolumen(lado));
			
		}else if(opcion.equals("e")) {
			System.out.println("Saliendo...");
		}
		else {
			System.out.println("Opcion inválida");
		}
	}

}
