package lab3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = in.nextInt();
        System.out.print("Input x: ");
        int x = in.nextInt();
        int i = 0;
        double answer = 0;
        do {
            double fakt = 0;
            for(int j = 0; j <= 2 * n; j++) {
                fakt *= j;
            }
            double z = Math.pow(-1, n) * (Math.pow(x, 2 * n) / (fakt));
            answer += z;
            i++;
        } while(i <= n);
        System.out.println(1-answer);
    }
}
