package hw_01_loops;

/**
 * Created by Alex on 14.06.2016.
 */
public class Even_01 {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 0) {
                sum += i;
                counter++;
            }
        }

        System.out.println("sum: " + sum + "; amount of even numbers between 1 and 99: " + counter);
    }
}
