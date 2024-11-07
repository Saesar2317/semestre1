import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int lecAnt, lecAct;
		double iva, total, kw, subtotal = 0;
		for(int i = 0; i < 50; i++){
		    String usuarios = sc.next();
		    lecAnt = rnd.nextInt((3000 - 1) + 1);
		    lecAct = rnd.nextInt((3000 - 1) + 1);
		    kw = lecAnt - lecAct;
		    kw = Math.abs(kw);
		    if(kw >= 0 && kw <=299){
		        subtotal = kw * 0.45;
		    }
		    else if(kw >= 300 && kw <= 450){
		        subtotal = kw * 0.68;
		    }
		    else if(kw >= 451 && kw <= 999){
		        subtotal = kw * 0.95;
		    }
		    else if(kw >= 1000){
		        subtotal = kw * 2.51;
		    }
		    iva = subtotal * 0.16;
	     	total = subtotal + iva;
	    	System.out.printf("la cantidad a pagar es %.2f: \n", total);
	    	System.out.printf("la lectura actual es: %d: \n", lecAct);
	    	System.out.printf("la lectura anterior es: %d: \n", lecAnt);
	    	System.out.printf("los kw consumidos son: %.2f: \n", kw);
	    	System.out.println(" ");
		}
		
	}
}
