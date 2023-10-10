package homework.lesson2;
import java.util.Scanner;
/*5. По введенному номеру определить цвет радуги
        (1 – красный, 4 – зеленый и т. д.).*/
public class Task5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the rainbow color1 number:");
        int month = Integer.parseInt(in.nextLine());
        in.close();
        switch(month)
        {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.print("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Light Blue");
                break;
            case 6:
                System.out.println("Blue");
                break;
            case 7:
                System.out.println("Violet");
                break;
            default:
                System.out.println("Incorrect value entered!");
        }
    }
}