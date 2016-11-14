/*************************************************************************
	> File Name: quickSort.java
	> Author: 
	> Mail: 
	> Created Time: 一 11/14 16:09:17 2016
 ************************************************************************/

public class quickSort {
    public static void main(String[] args) {
        int size = 20;
        int[] array;
        try {
            if (args != null && args[0] != null) {
               size = Integer.parseInt(args[0]);
            }
        } catch (Exception e) {
            size = 20;
        }
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start >= end || array == null || array.length <= end) {
            return;
        }
        int i = start, j = end, key = array[start];
        while (i < j) {
            while (i < j && key <= array[j]) j--;
            array[i] = array[j];
            while (i < j && key >= array[i]) i++;
            array[j] = array[i];
        }
        array[i] = key;
        quickSort(array, start, i - 1);
        quickSort(array, i + 1, end);
    }
}

