package Middle;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите размер масива от 1 до 10");
        int size = scan.nextInt();

        while (size < 1 || size > 10) {
            System.out.println("Ошибка, рамер должен быть от 1 до 10!");
            System.out.println("Попробуйте еще раз");
            size = scan.nextInt();
        }

        int[][] arrayInt = new int[size][size];

        System.out.println("заполните массив " + size + "х" + size + ":");
        for (int i = 0; i < size; i++) {
            for (int o = 0; o < size; o++) {
                System.out.print("[" + (i + 1) + "] [" + (o + 1) + "]: ");
                arrayInt[i][o] = scan.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            sum = sum + arrayInt[i][i];
        }
        System.out.println("Сумма главной диагонали равна: " + sum) ;
    }
}
