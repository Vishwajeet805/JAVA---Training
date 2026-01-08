package Sorting;
import java.util.Arrays;
import java.util.Collections;
class Main {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 1, 3};

        Arrays.sort(arr);

        for (int x : arr)
            System.out.print(x + " ");

        Arrays.sort(arr, Collections.reverseOrder());

        for (int x : arr)
            System.out.print(x + " ");
    }
}
