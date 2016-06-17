package hw_01_loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Alex on 16.06.2016.
 */
public class Reverse_06 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(r.readLine());
        r.close();

        String s = String.valueOf(input);
// reversing via StringBuilder
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());

        char[] reverser = s.toCharArray();


        for (int i = reverser.length - 1; i>=0; i--)
        {
            System.out.print(reverser[i]);
        }
    }

}
