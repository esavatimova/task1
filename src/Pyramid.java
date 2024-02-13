public class Pyramid extends Shape{
    private double s,h;

    public Pyramid(double s, double h) {
        super(h*s*1/3); //объем пирамиды (высота*площадь основания * 1/3)
        this.s = s;
        this.h = h;
    }



}
