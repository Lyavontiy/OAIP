package lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input X: ");
        double x = in.nextDouble();
        System.out.print("Input Y: ");
        double y = in.nextDouble();
        System.out.print("Input Z: ");
        double z = in.nextDouble();
        double a = Math.pow(2, -x) *
                   Math.sqrt(x + Math.pow(Math.pow(Math.abs(y), 3), 0.25)) *
                   Math.pow(Math.exp((x-1)/Math.sin(z)), 0.33333);
        System.out.println(a);
    }
}
