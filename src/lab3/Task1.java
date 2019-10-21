package lab3;

public class Task1 {
    public static void main(String[] args) {
        int a = 45,
            b = 90;

        int c = 180 - (a + b);

        if(a > 90 || b > 90 || c > 90) {
            System.out.println("Треугольник тупой, прям как я");
        } else {
            System.out.println("Однако... Не тупой");
        }
    }
}
