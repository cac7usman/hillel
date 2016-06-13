package operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by asus on 13.06.2016.
 */
public class Quadrant {
    public static void main(String[] args) throws Exception{
        int x, y;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter x and y: ");
        x = Integer.parseInt(bufferedReader.readLine());
        y = Integer.parseInt(bufferedReader.readLine());

        if (x>0 && y>0) System.out.println("1. quadrant");
        else if (x<0 && y>0) System.out.println("2. quadrant");
        else if (x<0 && y<0) System.out.println("3. quadrant");
        else if (x>0 && y<0) System.out.println("4. quadrant");
        else System.out.println("point belongs to one of the axes");

        bufferedReader.close();
    }
}
