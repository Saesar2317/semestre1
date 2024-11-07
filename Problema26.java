import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = sc.next();
		char digito;
		int contador = 0;
		System.out.println("la palabra es: " + nombre);
		for(int i = 0; i < nombre.length(); i++){
		    digito = nombre.charAt(i);
		    if(Character.isDigit(digito)){
		        contador++;
		    }
		}
		System.out.println("el total de digitos es; " + contador);
	}
}
