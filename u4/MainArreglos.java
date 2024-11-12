package operaciones;

public class MainArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrices2d();
		
	}

	public static void Matrices2d() {
		OperacionesConMatrices OM = new OperacionesConMatrices();
		System.out.println("La suma de la matriz: " + OM.suma());
	}
	
	
	
	public static void Arreglos() {
		OperacionesComunes oc = new OperacionesComunes();
		oc.Pares();
		
	}
	
}
