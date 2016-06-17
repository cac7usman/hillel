package hw_01_loops;

/**
 * Найти корень натурального числа с точностью до целого (рассмотреть вариант последовательного подбора и метод бинарного поиска)
 * Created by Alex on 16.06.2016.
 */
public class Root_03 {
    public static void main(String[] args) {
        System.out.println((int)Math.round(sqrt(120)));


    }
    public static double sqrt (int x)
    {
        double number = 1;
        double result = 0;

        while (x>0)
        {
            x = (int) (x - number);
            number = number + 2;
            result = result + ((x<0)?0:1);

        }

        return result;
    }
}
