package homework.lesson7.shapes;

public class Rectangle extends Shapes
{
    private static final String NAME = "Rectangle";
    private double height;
    private double weight;
    public Rectangle(double height,double weight)
    {
        this.height = height;
        this.weight = weight;
    }
    @Override
    public double getSquare()
    {
        double squere = height * weight;
        return squere;
    }
    @Override
    public double getPerimeter()
    {
        double perimeter = (height + weight) * 2;
        return perimeter;
    }
    @Override
    public String getName()
    {
        return NAME;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }
}
