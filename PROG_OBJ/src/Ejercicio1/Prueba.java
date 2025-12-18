package Ejercicio1;

class Prueba {

	public static void main(String[] args) {
		
		Persona alum1 = new Persona();

		alum1.edad = 20;
		alum1.nombre = "pepe";
		System.out.println(pepe.nombre + " Edad:" +   pepe.edad);
		
		alum1.saludar();
		alum1.despedirse();
		
		Persona alum2 = new Persona();
		alum2.edad = 18;
		alum2.nombre = "Ana";
		
		Persona aux = alum1;
		
		aux.saludar();
		
		alum2 = aux;
		
		alum2.saludar();
	}

}
