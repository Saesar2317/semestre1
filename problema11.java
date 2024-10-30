import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = 0;
	    System.out.println("Ingrese un numero del 0 al 10");
	    num = sc.nextInt();
		System.out.print((num >=0 && num <=5)?"malo":"");
		System.out.print((num >=6 && num <=7)?"regular":"");
		System.out.print((num >=8 && num <=9)?"bueno":"");
		System.out.print((num == 10)?"exelente":"");
	}
}
