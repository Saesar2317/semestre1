import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, decenas = 0;
		System.out.println("Ingrese un numero entero entre el 0 y el 99");
		num = sc.nextInt();
		if(num >= 0 && num <= 99){
		    decenas = num / 10;
		}
		System.out.println("el numero contiene: " + decenas + " decenas");
	}
}
