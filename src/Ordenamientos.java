
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
     public void SelectionSort(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Suponemos que el primer elemento es el menor

            // Buscar el menor elemento en el resto del arreglo
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambiar el elemento encontrado con el primer elemento
            int temp = arreglo[minIndex];
            arreglo[minIndex] = arreglo[i];
            arreglo[i] = temp;
        }
    }
      public void QuickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = inicio;
            int i = inicio + 1;
            int j = fin;
            int temp;

            while (i <= j) {
                while (i <= fin && arreglo[i] <= arreglo[pivote]) {
                    i++;
                }
                while (j > inicio && arreglo[j] > arreglo[pivote]) {
                    j--;
                }
                if (i < j) {
                    temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }

            temp = arreglo[pivote];
            arreglo[pivote] = arreglo[j];
            arreglo[j] = temp;

            QuickSort(arreglo, inicio, j - 1);
            QuickSort(arreglo, j + 1, fin);
        }
    }
}
