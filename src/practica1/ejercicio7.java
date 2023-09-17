package practica1;


public class Ejercicio7 {


    public static void main(String[] args) {
        // Suma pares e impares de  un numero y evalua la suma
        int digito1, digito2, digito3, digito4;
        int contador = 0;

        for (int i = 1000; i <= 9999; i++) {
            digito1 = i / 1000;
            digito2 = (i / 100) % 10;
            digito3 = (i / 10) % 10;
            digito4 = i % 10;
            int[] digitos = {digito1, digito2, digito3, digito4};
            if (evaluarSuma(digitos)) {
                System.out.println(i);
                contador++;
            }

        }

        System.out.println("Los numeros que cumplen con la condicion son: " + contador);
    }

    public static boolean evaluarSuma(int[] arreglo) {
        int sumaPar = 0;
        int sumaImpar = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                sumaPar = sumaPar + arreglo[i];
            } else {
                sumaImpar = sumaImpar + arreglo[i];
            }
        }
        return sumaPar == sumaImpar;
    }

}
