package homework.lesson3;
import java.util.Arrays;
/*3. Создайте 2 массива из 5 чисел.
Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и
сообщите, для какого из массивов это значение оказалось больше (либо
сообщите, что их средние арифметические равны).
Дополнительное задание*/
public class Task3
{
    public static void main(String[] args)
    {
        double[] array1 = new double[]{1, 2, 3, 4, 5};
        double[] array2 = new double[]{6, 7, 8, 9, 10};
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < array1.length; i++)
        {
            sum1 += array1[i] / 5;
        }
        for (int j = 0; j < array2.length; j++)
        {
            sum2 += array2[j] / 5;
        }
        if (sum1 > sum2)
        {
            System.out.println("Array1 > Array2");
        }
        else if (sum1 < sum2)
        {
            System.out.println("Array1 < Array2");
        }
        else
        {
            System.out.println("Array1 = Array2");
        }
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Array1 average: " + sum1);
        System.out.println("Array2 average: " + sum2);
    }
}
