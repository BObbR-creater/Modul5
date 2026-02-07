package Middle;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        System.out.println("Заполни массив на " + size + " элементов");
        System.out.println("Числа могут быть от 1 до 100");

        double[] Array = new double[size];

        for (int i = 0; i < size; i++) {
            double num;
            do {
                num = scan.nextDouble();
                double abs = Math.abs(num);

                if (abs < 1 || abs > 100) {
                    System.out.println("Внимение! число должно быть от 1 до 100!");
                }
            } while (Math.abs(num) < 1 || Math.abs(num) > 100);
            Array[i] = Math.abs(num);
        }

        System.out.println("Ваш массив: " + Arrays.toString(Array));

        double max = Array[0];
        for (double N : Array) {
            if (Math.abs(N) > Math.abs(max)) {
                max = N;
            }
        }
        System.out.println("Максимальное значение: " + max);
    }
}

