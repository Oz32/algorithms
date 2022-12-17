package SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        bubblesort(array);
        for (int a : array) {
            System.out.println(a);
        }
    }

    public static void bubblesort(int[] array1) {
        boolean sorted = true;
        int temp;
        while (sorted) {
            sorted = false;
            for (int a = 0; a < array1.length - 1; a++) {
                if (array1[a] > array1[a + 1]) {
                    temp = array1[a];
                    array1[a] = array1[a + 1];
                    array1[a + 1] = temp;
                    sorted = true;
                }
            }
        }
    }
}
