import java.util. * ;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String marca = "", tarjeta;
		double totPagar, comision;
		System.out.println ("ingrese la marca del aceite");
		marca = sc.next();
		if (marca.equalsIgnoreCase("Tyron")){
		    totPagar = 900;
		}
		else if (marca.equalsIgnoreCase("Bardahl")){
		    totPagar = 1300;
		}
		else if (marca.equalsIgnoreCase("Chevron")){
		    totPagar = 1700;
		}
		else {
		    System.out.println ("Marca invalida");
		    return;
		}
		System.out.println("¿Pagara con tarjeta? Si/No");
		tarjeta = sc.next();
		if (tarjeta.equalsIgnoreCase("Si")){
		    comision = totPagar * 0.03;
		    totPagar += comision;
		}
		System.out.printf("total a pagar: %.2f", totPagar);	
	    
	}
}
