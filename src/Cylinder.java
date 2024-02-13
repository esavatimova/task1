public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double height, double radius) {
        super(height * Math.PI * Math.pow(radius,2),radius); //объём цилиндра = высота*радиус в кв * 3,14
        this.height = height;
    }
}
