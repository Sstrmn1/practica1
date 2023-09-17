package practica1;

import java.util.Scanner;

public class Ejercicio1 {

//    Clasificacion de angulo segun sus grados
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los grados del ángulo");
        int grados = entrada.nextInt();

        System.out.println("Ingrese los minutos del ángulo: ");
        int minutos = entrada.nextInt();

        System.out.println("Ingrese los segundos del ángulo: ");
        int segundos = entrada.nextInt();

        int totalSegundos = grados * 3600 + minutos * 60 + segundos;

//        Evaluar si es una vuelta completa (mayor a 360 grados o 1296000 segundos)
        if (totalSegundos > 1296000) {
            totalSegundos = totalSegundos - 1296000;
        }

        evaluarAngulo(totalSegundos);
    }

    public static void evaluarAngulo(int anguloEnSegundos) {
        if (anguloEnSegundos == 0) {
            System.out.println("El ángulo es nulo.");
        } else if (anguloEnSegundos > 0 && anguloEnSegundos < 90 * 3600) {
            System.out.println("El ángulo es agudo.");
        } else if (anguloEnSegundos == 90 * 3600) {
            System.out.println("El ángulo es recto (90 grados).");
        } else if (anguloEnSegundos > 90 * 3600 && anguloEnSegundos < 180 * 3600) {
            System.out.println("El ángulo es obtuso.");
        } else if (anguloEnSegundos == 180 * 3600) {
            System.out.println("El ángulo es llano (180 grados).");
        } else if (anguloEnSegundos > 180 * 3600 && anguloEnSegundos < 360 * 3600) {
            System.out.println("El ángulo es cóncavo.");
        } else if (anguloEnSegundos == 360 * 3600) {
            System.out.println("El ángulo es completo (360 grados).");
        } 
    }

}
