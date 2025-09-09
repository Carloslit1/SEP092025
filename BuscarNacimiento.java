import java.util.Random;

public class BuscarNacimiento {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] anios = new int[20];

        // Insertar años de nacimiento aleatorios entre 1980 y 2005
        for (int i = 0; i < anios.length; i++) {
            anios[i] = rnd.nextInt(2005 - 1980 + 1) + 1980;
        }

        // Mostrar lista de años
        System.out.print("Años de nacimiento: ");
        for (int anio : anios) {
            System.out.print(anio + " ");
        }
        System.out.println();

        // Buscar quién nació en 1990
        boolean encontrado = false;
        for (int i = 0; i < anios.length; i++) {
            if (anios[i] == 1990) {
                System.out.println("La persona #" + (i + 1) + " nació en 1990.");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nadie nació en 1990.");
        }
    }
}
