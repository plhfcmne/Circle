import java.time.LocalDate;

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
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int wanted = 2_459_000;
        int month = 1;
        while (total < wanted) {
            total = total + salary;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");
            month++;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int plus = 17;
        int minus = 8;
        int coeff = 1000;
        int years = 10;
        int population = 12_000_000;
        for (int year = 1; year <= years; year++) {
            population = population + population * (plus - minus) / coeff;
            System.out.println("Год " + year + " численность населения составляет " + population + " человек ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double total = 15000;
        int month = 1;
        int wanted = 12_000_000;
        double percent = 7 / 100d;
        while (total < wanted) {
            total = total * percent + total;
            System.out.printf("Месяц %d , сумма накоплений равна %.2f рублей %n", month, total);
            month++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double total = 15000;
        int month = 1;
        int wanted = 12_000_000;
        double percent = 7 / 100d;
        while (total < wanted) {
            total = total * percent + total;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d , сумма накоплений равна %.2f рублей %n", month, total);
            }
            month++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double total = 15000;
        int month = 1;
        float year = 0f;
        double percent = 7 / 100d;
        while (year < 9) {
            total = total * percent + total;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d , сумма накоплений равна %.2f рублей %n", month, total);
                year = year + 0.5f;
            }
            month++;
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int initialFriday = 6;
        int firstDay = 1;
        int lastDay = 31;
        while (firstDay <= lastDay) {
            if (firstDay % 7 == initialFriday) {
                System.out.println("Сегодня пятница " + firstDay + "-е число. Необходимо подготовить отчет");
            }
            firstDay++;
        }

    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = LocalDate.now().getYear();
        int start = currentYear - 200;
        int finish = currentYear + 100;
        int period = 79;
        int initialYear = 0;
        for (int year = start; year <= finish; year++) {
            if (year % period == initialYear) {
                System.out.println(year);
            }
        }
    }
}
