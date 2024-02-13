import java.util.ArrayList;

public class Box extends Shape {
    private double volume; //емкость контейнера
    public Box(double volume) {
        super(volume);
        this.volume = volume;
    }


    ArrayList<Shape> shapeList = new ArrayList<Shape>();
    public boolean add(Shape s)
    {
        if (volume>=s.getVolume()) //емкость контейнера больше емкости фигуры?
        {
            shapeList.add(s);
            volume-=s.getVolume();
            return true;
        }
        else return false;


    }


}
