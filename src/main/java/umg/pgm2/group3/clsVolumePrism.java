package umg.pgm2.group3;

public class clsVolumePrism {
    public double calculateVolumePrism(double radius, double height) {
        double baseArea = Math.PI * radius * radius;
        return baseArea * height;
    }
}
