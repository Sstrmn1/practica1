package practica1;

public class Ejercicio10 {

    public static void main(String[] args) {
//        Serie fibonnaci, 40 primeros
        System.out.println("Serie fibonnaci");
        int num1, num2, num3, longitudSerie;
        num1 = 0;
        num2 = 1;
        num3 = 0;
        longitudSerie = 40;

        System.out.print(num1 + " ");
        for (int i = 1; i < longitudSerie; i++) {

            num3 = num1 + num2;
            System.out.print(num2 + " ");
            num1 = num2;
            num2 = num3;

        }
    }

}
