package lab2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double y, x;

        Scanner in = new Scanner(System.in);
        System.out.print("Input X: ");
        x = in.nextDouble();
        y = (Math.pow(3, x - 1.4 ) + Math.exp(x)) / (4.5 + x) + Math.tan(3 * x);
        System.out.println(y);
    }
}
