
public class Ordenamientos {

    /**
     * Método que implementa el algoritmo BubbleSort.
     * @param arreglo El arreglo de enteros que se va a ordenar.
     */
    public void bubbleSort(int[] arreglo) {
         // Obtener la longitud del arreglo
        int n = arreglo.length;
         //Ciclo externo que recorre el arreglo
        for (int i = 0; i < n - 1; i++) {
            // Variable para saber si se realizaron intercambios en la pasada
            boolean intercambiado = false;
             // Ciclo interno que compara elementos adyacentes
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                     // Intercambiar los elementos si el anterior es mayor que el siguiente
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true;//Se marcó un intercambio
                }
            }
            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!intercambiado) {
                break; // Salir del ciclo si no hubo intercambios
            }
        }
    }
    /**
     * Método que implementa el algoritmo de Inserción Directa.
     * @param arreglo El arreglo de enteros que se va a ordenar.
     */
    public void insercionDirecta(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int clave = arreglo[i]; // Elemento a insertar
            int j = i - 1;

            // Mover elementos mayores que clave una posición adelante
            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = clave; // Insertar el elemento en su posición correcta
        }
    }
}
