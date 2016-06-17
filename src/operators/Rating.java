package operators;

import java.io.RandomAccessFile;
import java.util.Random;

/**
 * Created by Alex on 14.06.2016.
 */
public class Rating {
    public static class Person {

        private String name;
        private String surname;
        private int mark;

        public int getMark() {
            return mark;
        }

        public String getSurname() {
            return surname;
        }

        public String getName() {
            return name;
        }


        public Person(String name, String surname, int mark) {
            this.name = name;
            this.surname = surname;
            this.mark = mark;
        }


    }

    public static void main(String[] args) {
        Random random = new Random();

        Person person1 = new Person("Alexandr", "Shumilovskyi", 100);
        Person person2 = new Person("Egor", "Zhevora", random.nextInt(100));
        Person person3 = new Person("Nikita", "Osadchuk", random.nextInt(100));


        System.out.println(person1.getName() + " " + person1.getSurname() + " - " + Rating.getMarks(person1.getMark()));
        System.out.println(person2.getName() + " " + person2.getSurname() + " - " + Rating.getMarks(person2.getMark()));
        System.out.println(person3.getName() + " " + person3.getSurname() + " - " + Rating.getMarks(person3.getMark()));

    }

    public static String getMarks(int mark) {
        if (mark >= 100) return "A";
        else if (mark >= 75 && mark <= 89) return "B";
        else if (mark >= 60 && mark <= 74) return "C";
        else if (mark >= 40 && mark <= 59) return "D";
        else if (mark >= 20 && mark <= 39) return "E";
        else return "F";


    }


}
