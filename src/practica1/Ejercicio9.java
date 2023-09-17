package practica1;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
//      Imprime serie de numeros primos (1 no es primo)
        
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int numero =2;
        System.out.println("Ingrese la cantidad de numeros primos...");
        int primos = entrada.nextInt();

        while (contador < primos) {
            if (esPrimo(numero)) {
                contador++;
                System.out.print(numero+" ");
            }
            numero++;
        }

    }

    public static boolean esPrimo(int num) {
        for (int i = 2; i <= num/2; i++) {
//            1 no es un numero primo
            if (num % i == 0 || num == 1) {
                return false;
            }
        }
        return true;
    }

}
