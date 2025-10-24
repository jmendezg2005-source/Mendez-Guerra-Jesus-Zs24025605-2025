import java.util.Scanner;
public class NuevoSalario {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el salario actual del obrero: $");
        double salario = leer.nextDouble();
        double incremento = salario * 0.25;
        double nuevoSalario = salario + incremento;

        System.out.println("Incremento: $" + incremento);
        System.out.println("Nuevo salario: $" + nuevoSalario);
    }
}
