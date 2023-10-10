package homework.lesson2;

import java.util.Scanner;


/*2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
     Напишите программу, в которую пользователь вводит сумму вклада и
     количество месяцев. А банк вычисляет конечную сумму вклада с учетом
     начисления процентов за каждый месяц.
     Для вычисления суммы с учетом процентов используйте цикл for. Пусть
     сумма вклада будет представлять тип float.*/
public class Additional2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the initial payment:");
        float sum = in.nextFloat();
        System.out.println("Enter the number of month:");
        int month = in.nextInt();
        for (int i = 0; i < month; i++) {
            sum = sum + (sum * 0.07f);
        }
        System.out.println("The sum after "+month+" months will be: "+sum);
    }
}
