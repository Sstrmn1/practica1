/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

/**
 *
 * @author HP
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    int sumaPar, sumaImpar;

    public static void main(String[] args) {
        // TODO code application logic here
//        for (int i = 1000; i <= 9999; i++) {
//            if (i % 400 == 0) {
//                System.out.println(i);
//            }
//        }

        System.out.println(digitos(153));
    }

//    Metodo que retorna digitos de un numero
    public static int digitos(int numero) {
//        Si es 0, tiene un solo digito
        if (numero == 0) {
            return 1;
        }

        int contador = 0;
//        Usar valor absoluto de un numerp
        numero = Math.abs(numero);

        while (numero > 0) {
            numero /= 10;
            contador++;
        }
        return contador;

    }
}
