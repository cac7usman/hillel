package hw_01_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Alex on 16.06.2016.
 */
public class ReverseArray_06 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[11];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }


        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;

        }

        System.out.println(Arrays.toString(array));

//        Collections.reverse(Arrays.asList(array));

//        System.out.println(Arrays.toString(array));


    }


}
