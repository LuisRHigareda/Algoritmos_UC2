import java.util.Arrays;

public class Pruebas {

    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 4, 2};

        // Imprimir el arreglo antes de ordenar
        System.out.println("Antes de ordenar: " + Arrays.toString(numeros));

        // Crear una instancia de la clase Ordenamientos
        Ordenamientos ordenamientos = new Ordenamientos();

        // Llamar al método burbuja para ordenar el arreglo
        ordenamientos.bubbleSort(numeros); 

        // Imprimir el arreglo después de ordenar
        System.out.println("Después de ordenar: " + Arrays.toString(numeros));
    }
}
