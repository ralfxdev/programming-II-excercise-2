package umg.pgm2.group2;

public class clsAreaPyramid {

    public double calculateAreaPyramid(double centerX, double centerY, double radius, double height) {
        double baseArea = Math.PI * radius * radius;

        double slantHeight = Math.sqrt(height * height + radius * radius);

        double lateralArea = 4 * (0.5 * radius * slantHeight);

        return baseArea + lateralArea;
    }
}
