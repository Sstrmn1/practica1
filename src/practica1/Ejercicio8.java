package practica1;


public class Ejercicio8 {


    public static void main(String[] args) {
//      Numeros capicua aleatorios de 3 digitos
        int numeroAleatorio, contador;
        contador = 0;
        for (int i = 0; i < 200; i++) {
            numeroAleatorio = (int) (Math.random() * 900) + 100;
            if (esCapicua(numeroAleatorio)) {
                System.out.println(numeroAleatorio);
                contador++;
            }
        }
        System.out.println("La cantidad de numeros capicua generados es: " + contador);
    }

    public static boolean esCapicua(int numero) {
        int primerDigito = numero / 100;
        int ultimoDigito = numero % 10;
        return primerDigito == ultimoDigito;
    }

}
