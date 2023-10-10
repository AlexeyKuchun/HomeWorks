package homework.lesson2;

/*1. Написать программу для вывода названия поры года по номеру месяца.
     При решении используйте оператор switch-case.*/

import java.util.Scanner;
public class Task1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the month number:");
        int month = Integer.parseInt(in.nextLine());
        in.close();
        switch(month)
        {
            case 1,2,12:
                System.out.println("It's Winter");
                break;
            case 3,4,5:
                System.out.println("It's Spring");
                break;
            case 6,7,8:
                System.out.println("Summer");
                break;
            case 9,10,11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Incorrect value entered!");
        }
    }
}
