package practica1;

public class Ejercicio4 {

    public static void main(String[] args) {
//        Imprime serie de suma de fracciones
        int num1, num2;
        num1 = 1;
        num2 = 2;
        float suma = (float) num1 / num2;
        System.out.print(num1 + "/" + num2 + " + ");
        for (int i = 0; i < 100; i++) {
            if (i == 99) {
//                Imprime el mensaje de manera diferente en la ultima iteracion
                num1 = num1 + 2;
                num2 = num2 + 3;
                System.out.println(num1 + "/" + num2);
                suma = suma + ((float) num1 / num2);
            } else {
                num1 = num1 + 2;
                num2 = num2 + 3;
                System.out.print(num1 + "/" + num2 + " + ");
                suma = suma + ((float) num1 / num2);
            }

        }
        System.out.println("La suma de la serie es: " + suma);
    }

}
