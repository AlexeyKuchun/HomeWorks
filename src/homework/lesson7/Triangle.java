package homework.lesson7;

public class Triangle extends Shapes
{
    private static final String name = "Triangle";
    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle(double sideA,double sideB,double sideC)
    {
        this.sideA = sideA;
        this.sideB= sideB;
        this.sideC= sideC;
    }
    @Override
    public double getSquare()
    {
        double squere = sideA * sideB * sideC;
        return squere;
    }
    @Override
    public double getPerimeter()
    {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }
    @Override
    public String getName()
    {
        return name;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}

