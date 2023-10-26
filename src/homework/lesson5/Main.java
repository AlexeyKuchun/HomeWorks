package homework.lesson5;
/*Основное задание
        1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
        --Добавьте метод, который позволяет начислять сумму на кредитную
        карточку.
        --Добавьте метод, который позволяет снимать с карточки некоторую
        сумму.
        --Добавьте метод, который выводит текущую информацию о карточке.
        --Напишите программу, которая создает три объекта класса CreditCard у
        которых заданы номер счета и начальная сумма
        --Тестовый сценарий для проверки:
        Положите деньги на первые две карточки и снимите с третьей.
        Выведите на экран текущее состояние всех трех карточек.*/

public class Main {
    public static void main(String[] args)
    {
        CreditCard creditCard1 = new CreditCard("222 333 444", 100000);
        CreditCard creditCard2 = new CreditCard("123 456 798", 200000.20f);
        CreditCard creditCard3 = new CreditCard("444 555 666", 350000.35f);

        creditCard1.info();
        creditCard2.info();
        creditCard3.info();

        creditCard1.refill(500);
        creditCard2.refill(499.80f);
        creditCard3.withdrawals(50000.35f);

        creditCard1.info();
        creditCard2.info();
        creditCard3.info();
    }
}
