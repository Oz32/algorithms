package SortingAlgorithms;

public class VariousSortingAlgorithms {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 7, 4, 10, 5, 3};
        insertionSort(array);
        for (int a : array) {
            System.out.println(a);
        }
    }

    public static void bubbleSort(int[] array) {
        boolean sort = true;
        int temp;
        while (sort) {
            sort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sort = true;
                }
            }
        }
    }

    public static void selection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int swap = array[i];
            array[i] = array[min];
            array[min] = swap;
        }
    }

    public static void insertionSort(int[] array) {
        for (int m = 1; m < array.length; m++) {
            int current = array[m];
            int j = m - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}