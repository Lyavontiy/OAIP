package lab5.task2;

public class main {
    private static SegmentCircle[] segment = new SegmentCircle[1];

    public static void main(String[] args) {
        segment[0] = new SegmentCircle(2,3);
        System.out.println(segment[0].calculateArea());
        System.out.println(segment[0].calculateDiametr());
        System.out.println(segment[0].calculateLength());

        segment[0].zoomIn(2);
        System.out.println(segment[0].calculateArea());
        System.out.println(segment[0].calculateDiametr());
        System.out.println(segment[0].calculateLength());
    }
}
