package lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println(2 * i);
        }
    }
}
