import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] massive =new int[3]; // 1-й способ
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(massive[i]);
        }
        double[] massive2 ={1.57, 7.654, 9.986}; // 2-й способ
        for (int i = 0; i < 3; i++) {
            System.out.println(massive2[i]);
        }
        int [] massive3 =new int[9]; // 3-й способ
        for (int i = 0; i < massive3.length; i++) {
            massive3[i]=i*2;
            System.out.println(massive3[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] massive = new int[3]; // 1-й способ
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(massive[i]);
            if (i != massive.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] massive2 = {1.57, 7.654, 9.986}; // 2-й способ
        for (int i = 0; i < massive2.length; i++) {
            System.out.print(massive2[i]);
            if (i != massive2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] massive3 = new int[9]; // 3-й способ
        for (int i = 0; i < massive3.length; i++) {
            massive3[i] = i * 2;
            System.out.print(massive3[i]);
            if (i != massive3.length - 1) {
                System.out.print(", ");
            }
        }
            System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] massive = new int[3]; // 1-й способ
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;
        for (int i = massive.length-1; i >=0; i--) {
            System.out.print(massive[i]);
            if (i !=0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] massive2 = {1.57, 7.654, 9.986}; // 2-й способ
        for (int i = massive2.length-1; i >=0; i--) {
            System.out.print(massive2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] massive3 = new int[9]; // 3-й способ
        for (int i = massive3.length-1; i>=0; i--) {
            massive3[i] = i * 2;
            System.out.print(massive3[i]);
            if (i !=0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] massive = new int[3]; // 1-й способ
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;
        System.out.println(Arrays.toString(massive));
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 1) {
                massive[i]++;
            }
            System.out.print(massive[i]);
            if (i != massive.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
}
}
