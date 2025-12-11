package Entidades;

class Main2 {

	public static void main(String[] args) {
		
		Alumno alumno = new Alumno();
		
		alumno.nif="324";
		alumno.nombre="Akinfewa";
		alumno.edad=67;
		alumno.matricula = new Matricula();
		
		alumno.matricula.codigo = 69;
		alumno.matricula.descripcion ="Escroto";
		alumno.matricula.cantidad = 80.67;
		
		System.out.println("Has pagado:");
		System.out.println(alumno.matricula.cantidad);
		System.out.println("Te gusta el:");
		System.out.println(alumno.matricula.descripcion);
		
		//QUIERO VER SI EL alumno ES MAYOR DE EDAD:
		alumno.esMayorEdad();
		
		Alumno alumno2 = new Alumno();
		alumno2.edad=12;
		
		alumno2.esMayorEdad();
		
		// QUIERO MOSTRAR EL CODIGO DE MATRICULA DEL ALUMNO alumno:
		int codigoAlumno = alumno.getCodigoMatricula();
		System.out.println(codigoAlumno);
		
//		System.out.println(alumno.getCodigoMatricula());
		
		//VAMOS A MOSTRAR EL PRECIO DE LA MÁTRICULA DEL ALUMNO CON EL IVA
		//EN EL MOMENTO DE LLAMAR AL METODO LOS PARAMETROS TIENEN QUE TENER UN VALOR
		double precio = alumno.matricula.cantidadConIVA(13);
		System.out.println("El precio es: " + precio);
	}

}
