package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by Alex on 14.06.2016.
 */
public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(r.readLine());
        r.close();

        System.out.println(factorial(input));
        System.out.println(factorial1(input));



    }
    public static Integer factorial(int n)
    {
        if (n<0) throw new IllegalArgumentException("n should be >=0");
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial*=i;


        }
        return factorial;
    }


    public static String factorial1(int n) {

        if (n<0) return String.valueOf(0);
        if (n==0) return String.valueOf(1);



        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i<=n; ++i) ret = ret.multiply(BigInteger.valueOf(i));

        return String.valueOf(ret);
    }
}
