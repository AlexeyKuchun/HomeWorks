package homework.lesson4;

import java.util.Scanner;

/*0. Создать трехмерный массив из целых чисел.
С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
задается из консоли.*/
public class Task0
{
    public static void main(String[] args)
    {
        int [][][] array = new int [3][3][3];

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                for (int k = 0; k < array.length; k++)
                {
                    array[i][j][k] = 8;
                    System.out.print(array[i][j][k]);
                }
            }
            System.out.println();
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to change the array:");
        int n = in.nextInt();
        System.out.println("New array is:");
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                for (int k = 0; k < array.length; k++)
                {
                    array[i][j][k] = 8+n;
                    System.out.print(array[i][j][k]);
                }
            }
            System.out.println();
        }
    }
}
