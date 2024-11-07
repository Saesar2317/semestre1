import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println ("Ingresa una palabra: ");
        String input = sc.next();
        String[] palabras = input.split(" ");
        System.out.println("La palabra invertida es: ");
        for (String palabra : palabras) {
            String reverso = new StringBuilder(palabra).reverse().toString();
            System.out.print(reverso + " ");
        }
    }
}
