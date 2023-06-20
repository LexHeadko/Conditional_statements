public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        //task3();
        //task4();
        //task5();
        //task6();
    }

    public static void task1() {
        System.out.println("Example 1");
        int p = 4;
        if (p % 2 == 0 && p != 0) {
            System.out.println("p - четное число!");
        }else {
            System.out.println("p - нечетное число!");
        }
    }

    public static void task2() {
        System.out.println("Example 2");
        double p = 9.8;
        double d = 10.3;
        double examinationP=10-p;
        double examinationD=10-d;
        System.out.println("|p|=" + Math.abs(examinationP));
        System.out.println("|d|=" + Math.abs(examinationD));
        if (Math.abs(examinationP) < Math.abs(examinationD)){
            System.out.println("Число p = " + p + " ближе к 10.");
        } else {
            System.out.println("Число d = " + d + " ближе к 10.");
        }
    }
}