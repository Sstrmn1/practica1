package practica1;
/**
 *
 * @author fabio
 */
public class ejercicio5 {

    public static void main(String[] args) {
     
        int dado1, dado2;
        int contador = 0;
        
        do {            
            dado1 = lanzarDado();
            dado2 = lanzarDado();
            contador++;
        } while (!(dado1 == 6 && dado2 == 6));
        
        System.out.println("Lanzamientos efectuados: "+ contador);

    }
    
    public static int lanzarDado() {
        double aleatorioBase = Math.random();
        int dado = (int) ((aleatorioBase * 6) + 1);
        return dado;
    }
    
}
