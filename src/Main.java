public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }


    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0 + 2; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i*2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

    }
    public static void task8() {
        System.out.println("Задача 8");
        int salary = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц "+i+" сумма накоплений равна "+total+" рублей");
        }

    }
    public static void task9() {
        System.out.println("Задача 9");
        int salary = 29_000;
        double persent=0.12/12;
        double total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            total = total + total*persent;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей %n",i,total);
        }
    }
    public static void task10() {
        System.out.println("Задача 10");
        int a=2;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d*%d=%d%n",a,i,a*i);
        }
    }
}
