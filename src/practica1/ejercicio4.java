/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

/**
 *
 * @author fabio
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        num1 = 1;
        num2 = 2;
        float suma = (float) num1 / num2;
        System.out.println(num1 + "/" + num2);
        for (int i = 0; i < 100; i++) {
            num1 = num1 + 2;
            num2 = num2 + 3;
            System.out.println(num1 + "/" + num2);
            suma = suma + ((float) num1 / num2);
        }
        System.out.println("La suma de la serie es: " + suma);
    }

}
/*
alternativa 

public class ejercicio4 {

    public static void main(String[] args) {
        int num1, num2;
        num1 = 1;
        num2 = 2;
        float suma = 0.0f;
        System.out.println(num1 + "/" + num2);

        for (int i = 0; i < 100; i++) {
            suma = suma + ((float) num1 / num2);
            num1 = num1 + 2;
            num2 = num2 + 3;
            System.out.println(num1 + "/" + num2);
        }

        System.out.println("La suma de la serie es: " + suma);
    }
}

*/
