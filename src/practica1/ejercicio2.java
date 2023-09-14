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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String numero = "";
        
        do {            
        System.out.println("ingrese un numero de 4 digitos...");
        numero = entrada.nextLine();    
        } while (numero.length()!=4);

        System.out.println("Nuevo numero: "+ numeroMayor(numero) + numeroMenor(numero));
    }

    public static String numeroMayor(String num) {
        int mayor = 0;
        int num1 = 0;
        for (int i = 0; i < num.length(); i++) {
            num1 = Character.getNumericValue(num.charAt(i));
            if (num1 > mayor) {
                mayor = num1;
            }
        }
        return Integer.toString(mayor);
    }

    public static String numeroMenor(String num) {
        int menor = Character.getNumericValue(num.charAt(0));
        int num1 = 0;
        for (int i = 0; i < num.length(); i++) {
            num1 = Character.getNumericValue(num.charAt(i));
            if (num1 < menor) {
                menor = num1;
            }
        }
        //String cadena = Integer.toString(num1);
        //return cadena;
        return Integer.toString(menor);
    }

}
