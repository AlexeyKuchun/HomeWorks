package homework.lesson2;
/*3. Напишите программу, которая выводит на консоль таблицу
     умножения.*/
public class Additional3
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
}
