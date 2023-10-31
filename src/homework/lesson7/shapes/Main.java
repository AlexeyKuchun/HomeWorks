package homework.lesson7.shapes;
/*1. Написать иерархию классов «Фигуры».
Фигура -> Треугольник -> Прямоугольник -> Круг.
Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
периметра.
Создать массив из 5 фигур.
Вывести на экран сумму периметра всех фигур в массиве.*/

public class Main
{
    public static void main(String[] args)
    {
        Shapes[] shapes = {new Cirkle(2), new Rectangle(3,4), new Triangle(5,6,7)};
        for (Shapes shape : shapes)
            System.out.println('\n'+ shape.getName() + '\n' + "square = " + shape.getSquare() + '\n' + "perimeter = " + shape.getPerimeter());
    }
}
