package Middle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        int[] Array = new int[size];
        System.out.println("Заполните массив на " + size + " элемента(ов).");
        for (int i = 0; i < size; i++) {
            Array[i] = scan.nextInt();
        }
        int sum = 0;
        for(int num : Array){
            sum = sum + num;
        }

        System.out.print("Ваш массив: ");
        for (int num : Array) {
            System.out.print(num + " ");
        }

        System.out.println(" Сумма массива: " + sum);
    }
}
