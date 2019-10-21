package lab5.task1;

public class Contiguous {
    private String dimension;
    private double volume;
    private double price;
    private int count;

    public String getDimension() {return this.dimension;}
    public double getVolume() {return this.volume;}
    public double getPrice() {return this.price;}
    public int getCount() {return this.count;}

    public Contiguous() {
        this.dimension = "Литр";
        this.volume = 1;
        this.price = 230;
        this.count = 1;
    }

    public Contiguous(String dimension, double volume, double price, int count) {
        this.dimension = dimension;
        this.volume = volume;
        this.price = price;
        this.count = count;
    }

    public double Calculation() {
        return this.price * this.count;
    }
}
