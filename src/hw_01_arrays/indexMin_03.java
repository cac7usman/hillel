package hw_01_arrays;

import java.util.Arrays;

/**
 * Created by Alex on 17.06.2016.
 */
public class indexMin_03 {

    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, 6, -100, 77, 0, 5};


        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (index == data[i])
                index = i;
        }
        index--;

       Arrays.sort(data);

        System.out.println(Arrays.toString(data));

        System.out.println("Minimum is " + data[0]);
        System.out.println("Index of minimum element is " + index);
    }
}











