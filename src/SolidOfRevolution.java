public class SolidOfRevolution extends Shape{ //общий клас шара и цилиндра
    private double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        //double volumeSOR = (double) 4 /3 * Math.PI * Math.pow(radius,3); //объём шара (4/3*3,14*р^3)
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
