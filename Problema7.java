import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String membresia;
		double compra, beneficio;
		System.out.println("ingrese la cantidad de compra");
		compra = sc.nextDouble();
		System.out.println("ingrese su membresia: clasica, negocio, premium o benefits");
		membresia = sc.next();
		beneficio = 0;
		switch (membresia) {
		case "clasica":
		    beneficio = 0;
		    break;
		case "negocio":
		    beneficio = 0.02 * compra;
		    break;
		case "premium":
		    beneficio = 0.05 * compra + 100;
		    break;
		case "benefits":
		    beneficio = 0.10 * compra + 0.05 * compra;
		    break;
		default: 
		    System.out.println("ingrese una memebresia valida");
		    break;
		}
		System.out.println("el beneficio de su membresia es;" + beneficio);
	}
}
