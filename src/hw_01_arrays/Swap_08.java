package hw_01_arrays;

import java.util.Arrays;

/**
 * Created by Alex on 17.06.2016.
 */
public class Swap_08 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        System.out.println(Arrays.toString(Swap(array)));


    }
    public static int[] Swap (int[] array)
    {
        int m, k;
        m = array.length/2;
        if (array.length%2!=0) k = m+1;
        else k = m;
        for (int i = 0; i < m; i++) {
            int tmp = array[i];
            array[i] = array[k+i];
            array[k+i] = tmp;


        }
        return array;
    }
}
