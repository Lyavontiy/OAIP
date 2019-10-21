package lab2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input X1: ");
        double x1 = in.nextDouble();
        System.out.print("Input X2: ");
        double x2 = in.nextDouble();
        double y = ((5 * x1 + Math.pow(1.3, x2)) / Math.cos(x1 + x2) + Math.cos(Math.pow(x2, 2) + 1.5) + ((5 + x2) / Math.sqrt(x1)));
        System.out.println(y);
    }
}
