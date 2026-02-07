package Easy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Введите степень: ");
        int n = scanner.nextInt();

        int res = 1;

        for (int i = 0; n > i; i++){
            res = res * a;
        }
        System.out.println(res);
    }
}

