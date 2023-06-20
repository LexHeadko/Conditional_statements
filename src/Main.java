import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Task 1");
        int p = 4;
        if (p % 2 == 0 && p != 0) {
            System.out.println("p=" + p + " - четное число!");
        } else {
            System.out.println("p=" + p + " - нечетное число!");
        }
    }

    public static void task2() {
        System.out.println("Task 2");
        double p = 9.7;
        double d = 10.2;
        double examinationP = 10 - p;
        double examinationD = 10 - d;
        if (Math.abs(examinationP) < Math.abs(examinationD)) {
            System.out.println("Число p=" + p + " ближе к 10, чем число d=" + d);
        } else {
            System.out.println("Число d=" + d + " ближе к 10, чем число p=" + p);
        }
    }

    public static void task3() {
        System.out.println("Task 3");
        int a = (int) (Math.random() * 156 + 3);
        if (a > 22 && a < 99) {
            System.out.println("a = " + a + " в диапазоне от 22 до 99!");
        } else {
            System.out.println("a = " + a + " не в диапазоне от 22 до 99!");
        }
    }

    public static void task4() {
        System.out.println("Task 4");
        int a = ThreadLocalRandom.current().nextInt(100, 999 + 1);
        int hundreds = a/100;
        int tens = (a - hundreds*100)/10;
        int units = (a - hundreds * 100 - tens * 10);
        if (hundreds > tens && hundreds > units) {
            System.out.println("Наибольшим членом числа " + a + ", является число " + hundreds+"!");
        } else if (tens > hundreds && tens > units) {
            System.out.println("Наибольшим членом числа " + a + ", является число " + tens+"!");
        } else {
            System.out.println("Наибольшим членом числа " + a + ", является число " + units+"!");
        }
    }

    public static void task5() {
        System.out.println("Task 5");
        int a=-8;
        int b=7;
        int c=6;
        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a+""+b+""+c);
            }else{
            System.out.print(a+""+c+""+b);}}
        else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + "" + a + "" + c);
            } else {
                System.out.println(b + ""+ c+""+a);
            }}
        else {
            if (a < b) {
                System.out.println(c + "" + a + "" + b);
            } else {
                System.out.println(c+""+b+""+""+a);
            }
        }
    }

    public static void task6() {

    }
}