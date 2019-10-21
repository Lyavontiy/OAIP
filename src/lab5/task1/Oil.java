package lab5.task1;

public class Oil {
    private String dimension;
    private double volume;
    private double price;
    private int count;

    public String getDimension() {return this.dimension;}
    public double getVolume() {return this.volume;}
    public double getPrice() {return this.price;}
    public int getCount() {return this.count;}

    public void setDimension(String value) { this.dimension = value;}
    public void setVolume(double value) { this.volume = value;}
    public void setPrice(double value) { this.price = value;}
    public void setCount(int value) { this.count = value;}

    public Oil() {
        this.dimension = "Баррель";
        this.volume = 1;
        this.price = 230;
        this.count = 1;
    }

    public Oil(String dimension, double volume, double price, int count) {
        this.dimension = dimension;
        this.volume = volume;
        this.price = price;
        this.count = count;
    }

    public double Calculation() {
        return this.price * this.count;
    }
}
