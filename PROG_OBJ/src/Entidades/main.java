package Entidades;

class main {

	//MÉTODO MAIN: ESTE MÉTODO ES EL PUNTO DE ARRANQUE DE LA APLICACIÓN
	public static void main(String[] args) {
		
		int numero=12;
		//INSTANCIAR UN OBJETO ALUMNO;
		Alumno alumno1 = new Alumno();
		//SI LO MOSTRAMOS AÍ, COMO TIENE VARIOS ELEMENTOS NOS MUESTRA UN RESUMEN RARO
		//alumno1 ES UNA VARIABLE OBJETO CON TRES CAMPOS:NOMBRE,NIF,EDAD
		alumno1.nif = "2345";
		alumno1.nombre = "Juan";
		alumno1.edad = 18;
		System.out.println(alumno1);
		//Mostramos porpiedad por propiedad
		System.out.println(alumno1.nif);
		System.out.println(alumno1.nombre);
		System.out.println(alumno1.edad);
		//INSTANCIAMOS OTRO ALUMNO:
		Alumno alumno2 = new Alumno();
		alumno2.nif = "75554";
		alumno2.nombre = "Pedro";
		alumno2.edad = 20;
		
		//PRACTICAMOS CON EJEMPLOS
		//¿Que alumno es mayor?
		if(alumno1.edad>alumno2.edad)
			System.out.println("Mayor el primero");
		else if(alumno1.edad<alumno2.edad)
			System.out.println("Mayor el segundo");
		else
			System.out.println("Iguales");
		//ASIGNAMOS AL PRIMER ALUMNO EL NOMBRE DEL SEGUNDO:
		alumno1.nombre = alumno2.nombre;
		
		//ARRAY DE ALUMNOS:
		Alumno[] alumnos = new Alumno [10];
		for(int i =0;i<alumnos.length;i++) {
			alumnos[i] = new Alumno ();
		}
	    //ASIGNO EDAD ALEATORIA A TODOS LOS ALUMNOS:
		for(int i=0; i<alumnos.length;i++) {
	    	alumnos[i].edad = (int) ( Math.random()*100);
	    }
	    //MOSTRAREMOS LA EDAD DE TODOS LOS ALUMNOS 
		//DEL ARRAY
		for(Alumno a: alumnos) {
	    	System.out.println(a);
	    }
	    		
	    	
	}

}
