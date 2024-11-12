package ejercicio1;

public class arreglos {
	public static void main(String[] args) {
		int [] arr1 = Aarreglos.crearArregloInt(20);
		arrgelos.imprimirArreglo(arr1);
		int [] arr2= arreglos.crearArregloint(20);
		arrgelos.imprimirArreglo(arr2);
		
		if(arr1.length == arr2.length) {
			int [] arrSum = operArreglos.sumarArrays(arr1, arr2);
			arrgelos.imprimirArreglo(arrSum);
		}
		
	}
	
	
}
