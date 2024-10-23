
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//problema 3
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		int num = sc.nextInt();
		System.out.println((num % 2 == 0)? "VERDADERO" : "FALSO");
		
		//problema 4
		int cali;
		do{
		    System.out.println("ingresa la calificacion del alumno: ");
		    cali = sc.nextInt();
		}
		while(!(cali>= 0 && cali <= 100)); // se va
		
		System.out.println((cali >= 70)? "APROBADO" : "REPROBADO");
		
		//problema 5
		int residuo;
		double elevar = 0;
		num = 0;
		System.out.println("ingresa un numero: ");
		num = sc.nextInt();
		//residuo = num % 10;
		residuo = num % 10;
		if (residuo < 4 ){
		    residuo = num / 2;
		    }else if (residuo >=4 && residuo <= 7){
		        elevar = Math.pow(num , 2);
		    }
		    else {
		        elevar = residuo * 20;
		    }
		System.out.println("resultado " + elevar);
	}
}

/******************************************************************************
Escribe un programa que lea de teclado un numero entero y determine
si es par o impar, Mostrar un valor boolean como resultado en su impresion
operador alternario ?

Escribe un programa que lea una calificacion de un alumno y obtenga como salida
obtenga como salida un mensaje si fue aprobado o reprobado (70 o mas aprobado)

Escribe un programa que lea un numero y si divido entre diez su residuo es menor
a 4 obtenga su mitad, si su residuo se ubica entre 4 y 7 obtenga su cuadrado
En caso contrario obtener 20 veces su valor. Mostrar el resultado en pantalla
*******************************************************************************/