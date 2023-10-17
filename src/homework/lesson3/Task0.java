package homework.lesson3;

import java.util.Arrays;
import java.util.Scanner;

/*0. Создайте массив целых чисел. Напишете программу, которая выводит
        сообщение о том, входит ли заданное число в массив или нет.
        Пусть число для поиска задается с консоли (класс Scanner).*/
public class Task0
{
    public static void main(String[] args)
    {
        System.out.println("Input the number : ");
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int flag=0;
        for (int i =0; i < array.length; i++)
        {
            if (array[i] == c)
            {
                flag++;
                System.out.println("In the array!");
            }
        }
        if (flag==0)
        {
            System.out.println("Not in the array!");
        }
        System.out.println(Arrays.toString(array));
        in.close();
    }
}
