package hw_01_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Alex on 17.06.2016.
 */
public class getMax_02
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(Arrays.toString(array));
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i = 0; i<arr.length; i++)
        {

            arr[i] = Integer.parseInt(reader.readLine());
        }


        return arr;
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}
