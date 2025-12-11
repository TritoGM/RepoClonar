package Entidades;

class Alumno {
	//ATRIBUTOS / PROPIEDADES / CAMPOS / VARIABLES
	String nif, nombre;
	int edad;
	Matricula matricula;

	
	//MÉTODOS: CÓDIGOS QUE LOS OBJETOS ALUMNO CREADOS EN TIEMPO DE EJECUCCIÓN PUEDEN LLAMAR
	
//    MÉTODO QUE MUESTRE POR PANTALLA SI EL ALUMNO ES MAYOR DE EDAD O NO                            
	//PONEMOS void PORQUE EL MÉTODO NO ME DEVULVE NINGÚN VALOR
	void esMayorEdad() {
		//EL CÓDIGO QUE HAGAMOS AQUÍ TIENE ACCESO DIRECTAMENTE A TODAS LAS PROPIEDADES DEL OBJETO QUE LO LLAMA
		if(edad>=18)
			System.out.println("Es mayor de edad");
		else
			System.out.println("No es mayor de edad");
	}
	
	//SI EL METODO RETORNA ALGUN VALOR, HAY QUE PONER EL TIPO DE DATO DE ESE VALOR RESULTANTE
	
	int getCodigoMatricula() {
		int result = matricula.codigo;
		return result;
	}


}
