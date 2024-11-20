package parte2;
import java.util.*;
public class matrices {
	public static int [][] crearMatrizInt(int filas, int columnas){
		Random rnd = new Random();
		int [][] matriz = new int [filas][columnas];
		for(int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j]= rnd.nextInt(101);
			}
		}
		return matriz;
	}
	public static void imprimirMatriz(int [][]matriz) {
		for(int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print("matriz[" + i + "][" + j + "]" + matriz [i][j]);
			}
			System.out.println();
		}
	}

}
