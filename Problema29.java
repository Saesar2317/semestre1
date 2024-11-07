import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0 , decimal = 0;
		String binario;
		char pos;
		System.out.println("introduzca un numero binario: ");
		binario = sc.next();
		for(int i = binario.length() - 1; i >= 0; i--){
		    pos = binario.charAt(i);
		    if(pos == '1'){
		        decimal += Math.pow(2 , num);
		    }
		    num++;
		}
		System.out.println("el numero en decimal es: " + decimal);
	}
}
