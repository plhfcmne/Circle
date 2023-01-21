import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random(7);
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        System.out.println("Задача 1");
        int[] array = generateRandomArray();
        //System.out.println(Arrays.toString(expenses));
        int sum=0;
        for (int cost:array) {
            sum=sum+cost;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей %n", sum);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] expenses = generateRandomArray();
        //System.out.println(Arrays.toString(expenses));
        int max=expenses[0];
        int min=expenses[0];
        for (int cost:expenses) {
            if (max < cost) {
                max=cost;
            }
            if (min > cost) {
                min=cost;
            }
            }
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей. Максимальная сумма трат за день составила "+max+" рублей");
        }

    public static void task3() {
        System.out.println("Задача 3");
        int[] expenses = generateRandomArray();
        //System.out.println(Arrays.toString(expenses));
        int sum=0;
        for (int cost:expenses) {
            sum=sum+cost;
        }
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей %n", (double)sum/expenses.length);

    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}
