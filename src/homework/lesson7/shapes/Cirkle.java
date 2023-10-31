package homework.lesson7.shapes;

public class Cirkle extends Shapes
{
    private static final String NAME = "Circle";
    private double radius;
    public Cirkle(double radius)
    {
        this.radius=radius;
    }
    @Override
    public double getSquare()
    {
        double square =Math.PI * Math.pow(radius,2);
        return square;
    }
    @Override
    public double getPerimeter()//длина окружности
    {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    @Override
    public String getName()
    {
        return NAME;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
}
