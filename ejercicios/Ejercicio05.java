package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int c = scanner.nextInt();

        int mayor;

        if (a >= b && a >= c) {
            mayor = a;
        } else if (b >= a && b >= c) {
            mayor = b;
        } else {
            mayor = c;
        }

        System.out.println("El número mayor es: " + mayor);

        scanner.close();
    }
}