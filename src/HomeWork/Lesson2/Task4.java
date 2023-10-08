package HomeWork.Lesson2;
import java.util.Scanner;

/*4. Для введенного числа t (температура на улице) вывести
     Если t>–5, то вывести «Тепло».
     Если –5>= t > –20, то вывести «Нормально».
     Если –20>= t, то вывести «Холодно».*/
public class Task4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature value:");
        int temp = in.nextInt();
        in.close();
        if (temp>-5)
        {
            System.out.println("Heat");
        }
        else if (temp<=-20)
        {
            System.out.println("Cold");
        }
        else if (temp<=-5 && temp>-20) {
            System.out.println("Normal");
        }
    }
}