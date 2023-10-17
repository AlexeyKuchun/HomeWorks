package homework.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*2. Создайте и заполните массив случайным числами и выведете
        максимальное, минимальное и среднее значение.
        Для генерации случайного числа используйте метод Math.random().
        Пусть будет возможность создавать массив произвольного размера.
        Пусть размер массива вводится с консоли.*/
public class Task2 {
    public static void main(String[] args)
    {
        Random rand = new Random();

        Scanner in = new Scanner(System.in);
        System.out.println("Input the array size:");
        int lengh = in.nextInt();

        int[] array = new int[lengh];
        int max = 0;
        int min = 50;
        int average = 0;

        for (int i = 0; i < array.length; i++)
        {
            array[i] = rand.nextInt(50);
                if (max < array[i])
                {
                    max = array[i];
                }
                else if (array[i] < min)
                {
                    min = array[i];
                }
                average += array[i] / lengh;
        }
        System.out.println("Source array:" +Arrays.toString(array));
        System.out.println("Max array number: " + max);
        System.out.println("Min array number: " + min);
        System.out.println("Average array number: " + average);
    }
}