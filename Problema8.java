import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int venta;
		double bono = 0;
		System.out.println("ingrese la cantidad que vendio en el mes");
		venta = sc.nextInt();
		if ( venta >= 10000){
		    bono = venta * 0.05;
		}
		else if (venta >= 5000 && venta <10000 ){
		    bono = venta * 0.03;
		}
		System.out.println("usted recibira un bono de " + bono);
	}
}
