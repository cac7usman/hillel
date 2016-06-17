package hw_01_loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Alex on 14.06.2016.
 */
public class PrimeNumber_02 {
    public static void main(String[] args) throws Exception {
        int x;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter some number ");
        x = Integer.parseInt(bufferedReader.readLine());

        if (isPrime(x)) {

            System.out.println(x + " is a Prime number");

        }
        else
            System.out.println(x + " is a Composite number");

        bufferedReader.close();
    }

    public static boolean isPrime(int n) {
        for (int i=2; i<=Math.sqrt((n)); i++)
        {
            if (n%i==0)
                return false;


        }
        return true;


    }

}
