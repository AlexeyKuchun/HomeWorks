package homework.lesson7.interfacePosition;
/*2. Создать классы "Директор", "Рабочий", "Бухгалтер".
        Реализовать интерфейс с методом, который печатает название должности и
        имплементировать этот метод в созданные классы.*/
public class Main
{
    public static void main(String[] args)
    {
        Position dir = new Director();
        Position work = new Worker();
        Position account = new Accountant();

        dir.sendMessage();
        work.sendMessage();
        account.sendMessage();

    }
}
