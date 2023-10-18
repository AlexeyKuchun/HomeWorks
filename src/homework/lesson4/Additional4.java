package homework.lesson4;

import java.util.Arrays;
import java.util.Random;

/*5. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках
        двумерного массива по возрастанию.*/
public class Additional4 {
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[][] array = new int[5][5];
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                array[i][j] = rand.nextInt(10);
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                Arrays.sort(array[i]);
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
}
