package practica1;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        // Imprime dias del mes, evaluando si año es bisiesto
        Scanner entrada = new Scanner(System.in);
        int mes, año;
        do {
            System.out.println("ingrese mes...");
            mes = entrada.nextInt();
        } while (mes > 12 || mes < 1);
        System.out.println("Ingrese el año...");
        año = entrada.nextInt();
        String[] datosMes = diasEnMes(mes, esBisiesto(año));
        System.out.println("En el año " + año +" el mes de "+ datosMes[0] +" tiene " + datosMes[1] + " dias ");

    }


    public static boolean esBisiesto(int año) {
        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static String[] diasEnMes(int mes, boolean esAñoBisiesto) {
        String cadenaMes, cadenaDias;

        switch (mes) {
            case 1:
                cadenaMes = "enero";
                cadenaDias = "31";
                break;
            case 2:
                cadenaMes = "febrero";
                if (esAñoBisiesto) {
                    cadenaDias = "29";
                } else {
                    cadenaDias = "28";
                }

                break;
            case 3:
                cadenaMes = "marzo";
                cadenaDias = "31";
                break;
            case 4:
                cadenaMes = "abril";
                cadenaDias = "30";
                break;
            case 5:
                cadenaMes = "mayo";
                cadenaDias = "31";
                break;
            case 6:
                cadenaMes = "junio";
                cadenaDias = "30";
                break;
            case 7:
                cadenaMes = "julio";
                cadenaDias = "31";
                break;
            case 8:
                cadenaMes = "agosto";
                cadenaDias = "31";
                break;
            case 9:
                cadenaMes = "septiembre";
                cadenaDias = "30";
                break;
            case 10:
                cadenaMes = "octubre";
                cadenaDias = "31";
                break;
            case 11:
                cadenaMes = "noviembre";
                cadenaDias = "30";
                break;
            case 12:
                cadenaMes = "diciembre";
                cadenaDias = "31";
                break;
            default:
                cadenaMes = "";
                cadenaDias = "";
                throw new AssertionError();
        }

        String[] infoMes = new String[]{cadenaMes, cadenaDias};
        return infoMes;
    }

}
