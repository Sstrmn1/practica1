package practica1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Forma nuevo numero en base a su menor y mayor digito 
        
        Scanner entrada = new Scanner(System.in);
        String numero = "";
        
        do {            
        System.out.println("Ingrese un numero de 4 digitos:");
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
