import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        //task4();
        //task5();
        //task6();
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
}