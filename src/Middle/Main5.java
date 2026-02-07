package Middle;

import java.util.Random;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Пример: " + i + " из 5");

            int A = new Random().nextInt(10);
            int B = new Random().nextInt(10);

            if (A == 0 || B == 0) {
                A = new Random().nextInt(10);
                B = new Random().nextInt(10);
            }

            System.out.println("Давай проверим насколько ты знаешь таблицу умножения ");

            System.out.println("Это твои числа для умножения! " + A + " И " + B);

            int C = A * B;

            System.out.println("Сколько будет A * B?");
            int chek = scan.nextInt();

            if (C != chek) {
                System.out.println("Не верно, это будет: " + C);
            } else {
                System.out.println("Молодец, правильно!");
            }
        }
    }
}
