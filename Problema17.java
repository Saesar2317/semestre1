import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Random rnd = new Random();
	    int numero, mltp3 = 0;
	    while(true){
	         numero = rnd.nextInt(20);
	         System.out.println("el numero es: " + numero);
	         if(numero == 0){
	             break;
	         }
	         if(numero %3 == 0){
	             mltp3++;
	         }
	    }
	    System.out.println("Se imprimieron " + mltp3 + " multiplos de 3");
	}
}
