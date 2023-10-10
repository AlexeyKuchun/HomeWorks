package homework.lesson2;
import java.util.Scanner;
/*2. Написать программу для вывода названия поры года по номеру месяца.
     При решении используйте оператор if-else-if.*/
public class Task2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the month number:");
        int month = Integer.parseInt(in.nextLine());
        in.close();
        if (month>=3 && month<=5)
        {
            System.out.println("It's Spring");
        }
        else if (month>=6 && month<=8)
        {
           System.out.println("It's Summer");
        }
        else if (month>=8 && month<=10)
        {
            System.out.println("This is Autumn");
        }
        else if (month<=2 || month == 12)
        {
            System.out.println("It's Winter");
        }
        else
        {
            System.out.println("Data entry error!");
        }
    }
}
