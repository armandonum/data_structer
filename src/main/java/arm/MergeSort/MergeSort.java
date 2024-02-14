package arm.MergeSort;

import arm.MergeSort.IMergeSort;

public class MergeSort implements IMergeSort {
    public void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] helper = new int[arr.length];
        mergeSort(arr, helper, 0, arr.length - 1);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(arr, helper, low, middle); // Ordena la mitad izquierda
            mergeSort(arr, helper, middle + 1, high); // Ordena la mitad derecha
            merge(arr, helper, low, middle, high); // Combina ambas mitades ordenadas
        }
    }

    @Override
    public void merge(int[] arr, int[] helper, int low, int middle, int high) {
        // Copia el array a un array auxiliar
        for (int i = low; i <= high; i++) {
            helper[i] = arr[i];
        }

        int i = low;
        int j = middle + 1; // Índice inicial de la segunda mitad
        int k = low; // Índice inicial del array a fusionar

        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                arr[k] = helper[i];
                i++;
            } else {
                arr[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = helper[i];
            k++;
            i++;
        }
    }

    @Override
    public void quickSort(int[] array2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
