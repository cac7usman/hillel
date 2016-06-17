package hw_01_loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alex on 14.06.2016.
 */
public class Sum_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(r.readLine());
        r.close();

        String s = String.valueOf(input);
        String[] array = s.split("");

        int sum = 0;
        for (String string : array)
        {
            sum+=Integer.parseInt(string);
        }

        System.out.println(sum);
    }
}
