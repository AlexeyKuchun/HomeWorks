package homework.lesson1;

/*1. Написать программу для вывода «Hello <user>» на консоль.
     Пусть <user> вводиться с консоли, программа должна потребовать ввод <user>.
     Для чтения с консоли используйте класс Scanner.*/

import java.util.Scanner;

public class Task
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter User name: ");
        String user = in.nextLine();
        System.out.print("Hello " + user + "!");
        in.close();
    }
}
