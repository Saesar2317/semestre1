import java.util.*;
public class Alumnos 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n; 
        System.out.print("Alumnos en clase: ");
        n = sc.nextInt();

        
        double[] calificaciones = new double[n];

        
        double suma = 0;
        for (int i = 0; i < n; i++)
        {
            System.out.print("Ingrese la calificación del alumno " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
            suma += calificaciones[i]; 
        }

        double promedio = suma / n;

        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < n; i++) 
        {
            if (calificaciones[i] >= promedio) 
            {
                mayor++;
            }
            else 
            {
                menor++;
            }
        }

        System.out.println("\nEl promedio del grupo es: " + promedio);
        System.out.println("Alumnos con calificación mayor o igual al promedio: " + mayor);
        System.out.println("Alumnos con calificación menor al promedio: " + menor);

    }
}

