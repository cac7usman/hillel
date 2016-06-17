package hw_01_arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Alex on 17.06.2016.
 */
public class arraysSort_09 {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, 6, -100, 77, 0, 5};

//        Arrays.sort(data);


        BubbleSort(data);

        System.out.println(Arrays.toString(data));
    }

    public static void BubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

}



