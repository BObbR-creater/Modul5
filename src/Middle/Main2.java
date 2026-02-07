package Middle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100: ");
        double i = scan.nextDouble();

        //проверка услловия
        while (i < 1 || i > 100) {
            System.out.println("Ошибка, введите число от 1 до 100!");
            i = scan.nextDouble();
        }

        double[] arrayDouble = new double[]{i};
        //создали массив и заполнили его

        double res = 0;

        for (int o = 2; o != i; o++) {
            res = i / o;
            if (res % 1 == 0) {
                System.out.println(res);
            }  // РАДУЕМСЯ ЖИЗНИ
        }
    }
}
