package operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by asus on 13.06.2016.
 */
public class Maximum {
    public static void main(String[] args) throws Exception{
        int a, b, c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a, b, c: ");
        a = Integer.parseInt(bufferedReader.readLine());
        b = Integer.parseInt(bufferedReader.readLine());
        c = Integer.parseInt(bufferedReader.readLine());

        System.out.println(Math.max(a+b+c, a*b*c)+3);

        bufferedReader.close();

    }
}
