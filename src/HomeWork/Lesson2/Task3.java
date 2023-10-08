package HomeWork.Lesson2;
import java.util.Scanner;
/*3. Напишите программу, которая будет принимать на вход число и на
     выход будет выводить сообщение четное число или нет.
     Для определения четности числа используйте операцию получения
     остатка от деления - операция выглядит так: '% 2').*/
public class Task3
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value: ");
        int number = in.nextInt();
        if (number%2==0)
        {
            System.out.println("This is an even number.");
        }
        else
        {
            System.out.print("This is an odd number.");
        }
        in.close();
    }
}
