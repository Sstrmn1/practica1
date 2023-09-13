/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los grados del ángulo: ");
        int grados = scanner.nextInt();

        System.out.print("Ingrese los minutos del ángulo: ");
        int minutos = scanner.nextInt();

        System.out.print("Ingrese los segundos del ángulo: ");
        int segundos = scanner.nextInt();

        int totalSegundos = grados * 3600 + minutos * 60 + segundos;

        if (totalSegundos == 0) {
            System.out.println("El ángulo es nulo.");
        } else if (totalSegundos > 0 && totalSegundos < 90 * 3600) {
            System.out.println("El ángulo es agudo.");
        } else if (totalSegundos == 90 * 3600) {
            System.out.println("El ángulo es recto (90 grados).");
        } else if (totalSegundos > 90 * 3600 && totalSegundos < 180 * 3600) {
            System.out.println("El ángulo es obtuso.");
        } else if (totalSegundos == 180 * 3600) {
            System.out.println("El ángulo es llano (180 grados).");
        } else if (totalSegundos > 180 * 3600 && totalSegundos < 360 * 3600) {
            System.out.println("El ángulo es cóncavo.");
        } else if (totalSegundos == 360 * 3600) {
            System.out.println("El ángulo es completo (360 grados).");
        } else {
            System.out.println("El ángulo no está en el intervalo de 0° a 360°.");
        }

        scanner.close();
    }

}
