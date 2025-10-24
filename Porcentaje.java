import java.util.Scanner;
public class Porcentaje {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de hombres: ");
        int hombres = leer.nextInt();

        System.out.print("Ingresa la cantidad de mujeres: ");
        int mujeres = leer.nextInt();

        int total = hombres + mujeres;
        int porcentajeH = (hombres * 100) / total;
        int porcentajeM = (mujeres * 100) / total;

        System.out.println("Total de estudiantes: " + total);
        System.out.println("Porcentaje de hombres: " + porcentajeH + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeM + "%");
    }
}
