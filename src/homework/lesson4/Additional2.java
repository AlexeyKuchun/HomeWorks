package homework.lesson4;

import java.util.Random;
import java.util.Scanner;

/*3. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех
        элементов массива.*/
public class Additional2
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int [][] array = new int [5][5];
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                array[i][j] = rand.nextInt(10);
                sum+=array[i][j];
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        System.out.print("Sum: " +sum);
    }
}
