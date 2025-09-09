import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class BusquedaFallidaDemo {

    public static void main(String[] args) {
        Random rnd = new Random();
        Set<Integer> numeros = new HashSet<>();

        // Insertar 20 números aleatorios entre 1 y 100
        while (numeros.size() < 20) {
            int n = rnd.nextInt(100) + 1;
            numeros.add(n);
        }

        System.out.println("Números insertados: " + numeros);

        int intentos = 0;
        int fallos = 0;
        int encontrado = -1;

        // Buscar hasta encontrar un número correcto
        while (true) {
            int candidato = rnd.nextInt(100) + 1;
            intentos++;
            if (numeros.contains(candidato)) {
                encontrado = candidato;
                break;
            } else {
                fallos++;
            }
        }

        System.out.println("Número encontrado: " + encontrado);
        System.out.println("Intentos totales: " + intentos);
        System.out.println("Fallos antes de acierto: " + fallos);
    }
}
