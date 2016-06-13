package operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by asus on 13.06.2016.
 */
public class positiveNumbers {
    public static void main(String[] args) throws Exception{


        int x, y, z;
        int sum = 0;


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter x, y, z: ");
        x = Integer.parseInt(bufferedReader.readLine());
        y = Integer.parseInt(bufferedReader.readLine());
        z = Integer.parseInt(bufferedReader.readLine());

        if (x>=0) sum += x;
        if (y>=0) sum += y;
        if (z>=0) sum += z;

        System.out.println(sum);

        bufferedReader.close();

    }
}
