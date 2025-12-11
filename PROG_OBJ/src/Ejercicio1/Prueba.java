package Ejercicio1;

class Prueba {

	public static void main(String[] args) {
		
		Persona pepe = new Persona();

		pepe.edad = 20;
		pepe.nombre = "pepe";
		System.out.println(pepe.nombre + " Edad:" +   pepe.edad);
		
		pepe.saludar();
		pepe.despedirse();
		
		Persona ana = new Persona();
		ana.edad = 18;
		ana.nombre = "Ana";
		
		Persona aux = pepe;
		
		aux.saludar();
		
		ana = aux;
		
		ana.saludar();
	}

}
