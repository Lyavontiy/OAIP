package lab5.task2;

public class SegmentCircle {
    public double chord;
    public double height;

    public SegmentCircle(double chord, double height) {
        this.chord = chord;
        this.height = height;
    }

    public void zoomIn(double size) {
        this.chord = chord * size;
        this.height = height * size;
    }

    public void zoomOut(double size) {
        this.chord = chord / size;
        this.height = height / size;
    }

    double calculateArea() {
        return 2 * Math.PI * calculateRadius();
    }

    private double calculateRadius() {
        return Math.sqrt(Math.pow(this.chord, 2) + Math.pow(this.height, 2));
    }

    public double calculateDiametr() {
        return calculateRadius() * 2;
    }

    public double calculateLength() {
        return calculateRadius() * Math.PI;
    }

}
