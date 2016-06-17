package hw_01_arrays;

import java.util.Arrays;

/**
 * Created by Alex on 17.06.2016.
 */
public class getMin_01 {
    public static void main(String[] args) {

        int[] array = {-50, 6, 70, 77, -101};


        int min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < min);
            min = array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Min is "+min);


    }
}
