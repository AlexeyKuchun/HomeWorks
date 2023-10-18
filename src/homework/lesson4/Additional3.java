package homework.lesson4;

import java.util.Random;

/*4. Создайте двумерный массив. Выведите на консоль диагонали массива.*/
public class Additional3
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[][] array = new int[5][5];
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                array[i][j] = rand.nextInt(1,10);
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                if(i!=j && (array.length - i -1) !=j)
                {
                    array [i][j]=0;
                }
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
}

