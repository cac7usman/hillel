package hw_01_operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by asus on 13.06.2016.
 */
public class Maximum_04 {
    public static void main(String[] args) throws Exception{
        int a, b, c;
        int max;
        int sum, mult;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a, b, c: ");
        a = Integer.parseInt(bufferedReader.readLine());
        b = Integer.parseInt(bufferedReader.readLine());
        c = Integer.parseInt(bufferedReader.readLine());

        System.out.println(Math.max(a+b+c, a*b*c)+3);



        sum = ((a+b+c)+3);
        mult = ((a*b*c)+3);

//        max = sum>mult ? sum : mult;
        max = ((a+b+c)+3)> ((a*b*c)+3) ? ((a+b+c)+3) : ((a*b*c)+3);
        System.out.println( max );

        bufferedReader.close();

    }
}
