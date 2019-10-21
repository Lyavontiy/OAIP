package lab5.task1;

public class main {
    private static Oil[] oil = new Oil[2];
    private static Gas[] gas = new Gas[2];
    private static Contiguous[] contiguous = new Contiguous[2];
    public static void main(String[] args) {
        System.out.println("Нефть!");
        oil[0] = new Oil();
        oil[1] = new Oil("Баррель", 20, 450, 10);
        System.out.println(oil[0].Calculation());
        System.out.println(oil[1].Calculation());

        System.out.println("Газ!");
        gas[0] = new Gas();
        gas[1] = new Gas("Кубометр", 20, 450, 10);
        System.out.println(gas[0].Calculation());
        System.out.println(gas[1].Calculation());

        System.out.println("Смежное!");
        contiguous[0] = new Contiguous();
        contiguous[1] = new Contiguous("Литр", 20, 450, 10);
        System.out.println(contiguous[0].Calculation());
        System.out.println(contiguous[1].Calculation());
    }
}
