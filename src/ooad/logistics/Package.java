package ooad.logistics;

public class Package {

    private String packageNumber;
    private double weight;
    private double length;
    private double width;
    private double height;

    public Package(double weight, double length, double width, double height) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

}
