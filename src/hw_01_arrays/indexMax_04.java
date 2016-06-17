package hw_01_arrays;

import java.util.Arrays;

/**
 * Created by Alex on 17.06.2016.
 */
public class indexMax_04 {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, 6, -100, 77, 0, 5};


        int index = 0;
        int max = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > index) {

                max = data[i];
                index = i;
            }
        }


//            Arrays.sort(data);

            System.out.println(Arrays.toString(data));

            System.out.println("Maximum is " + max);
            System.out.println("Index of maximum element is " + index);
        }

    }


