package homework.lesson2;

import java.util.Scanner;

/*3. Напишите программу, где пользователь вводит любое целое
     положительное число. А программа суммирует все числа от 1 до
     введенного пользователем числа.
     Для ввода числа воспользуйтесь классом Scanner.*/
public class Task8 {
    public static void main(String[] args)
    {
        int sum = 0;
        int counter = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = in.nextInt();

        while (counter <= number)
        {
            sum += counter;
            counter++;
        }
        System.out.println("The sum is:" + sum);
        in.close();
    }
}
