public class Ball extends SolidOfRevolution{ //мяч
    public Ball(double radius) {
        super((double) 4 /3 * Math.PI * Math.pow(radius,3),radius); //объем как у шара + сохраняем радиус
    }
}
