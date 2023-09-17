package practica1;

import java.util.Scanner;


public class Ejercicio6 {


    public static void main(String[] args) {
//        Division por restas sucesivas
        Scanner entrada = new Scanner(System.in);

        int dividendo, divisor, cociente, residuo;
        cociente = 0;

        System.out.println("Ingrese dividendo:");
        dividendo = entrada.nextInt();
        do {
            System.out.println("Ingrese divisor (distinto de 0):");
            divisor = entrada.nextInt();
        } while (divisor == 0);

//        do {
//            if (cociente == 0 && divisor > dividendo) {
//                break;
//            } else {
//                dividendo -= divisor;
//                cociente++;
//            }
//        } while (dividendo >= divisor);

        while (dividendo>=divisor) {            
            dividendo -= divisor;
            cociente++;
        }
        residuo = dividendo;

        System.out.printf("El resultado de la division es Cociente: %d Residuo: %d%n", cociente, residuo);
    }

}
