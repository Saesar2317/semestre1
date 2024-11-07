import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int num = rnd.nextInt((100 - 1) + 1);
		int numA = 0;
		boolean bandera = true;
		while(bandera){
		    numA = sc.nextInt();
		    if(numA < num ){
		        System.out.println("el numero es mas alto");
		    }
		    if(numA > num){
		        System.out.println("el numero es mas chico");;
		    }
		    if(numA == num){
		        System.out.println("Adivinaste");
		        bandera = false;
		    }
		    
		}
		
	}
}
