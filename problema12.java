import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
	    Random rnd = new Random();
	    Scanner sc = new Scanner(System.in);
	    String nombre, nombreJoven = "", nombreViejo = "";
	    int edad, joven = 101, viejo = 0;
		for (int i = 0; i < 10; i++){
		    System.out.print("Introduce el nombre de la persona");
		    nombre = sc.nextLine();
		    edad = rnd.nextInt(101);
		    if(edad < joven){
		        joven = edad;
		        nombreViejo = nombre;
		    }
		    if(edad > viejo){
		        viejo = edad;
		        nombreJoven = nombre;
		    }
		}
		    System.out.println("La persona mas longeva fue " + nombreViejo + " con una edad de " + viejo + " años");
		    System.out.println("La persona mas joven fue " + nombreJoven + " con una edad de " + joven + " años");
		
	}
}
