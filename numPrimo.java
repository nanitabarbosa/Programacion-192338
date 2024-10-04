import java.util.Scanner;

public class numPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es primo o no: ");
        int numero = scanner.nextInt();

        int contador = 0;

        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;

            }
        }
        if (contador <= 1) {
            System.out.println("El " + numero + " es un numero primo");

        } else {
            System.out.println("El " + numero + " no es un numero primo");
        }

        int max = 100;
        System.out.println("Los numeros Primos del 1 al 100 son: ");

        for (int i = 2; i <= max; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break; 
                }
            }

            if (esPrimo) {
                System.out.println(i);
            }
        }
    }

}
