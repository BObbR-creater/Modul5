package Middle;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число, фактриал которого нужно найти: ");
        int num = scan.nextInt(); //7
        int fac = 1;

        for (int i = 1; i <= num; i++) {
            fac = fac * i;
        }
        System.out.println("Факториал числа " + num + " равно " + fac);
    }
}
