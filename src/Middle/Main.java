package Middle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        int[] BOB = new int[size];
        System.out.println("Заполните массив на " + size + " элемента(ов).");
        for (int i = 0; i < size; i++) {
            BOB[i] = scan.nextInt();
        }
        System.out.print("Ваш массив: ");
        for (int num : BOB)
            System.out.print(num);
        System.out.println(" Сумма массива: " + Arrays.stream(BOB).sum());
    }
}
