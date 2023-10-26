package homework.lesson6;
/*1. Класс Phone.
        ok-Создайте класс Phone, который содержит переменные number, model и
            weight.
        ok- Создайте три экземпляра этого класса.
        Выведите на консоль значения их переменных.
        ok-Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
            звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber –
            возвращает номер телефона. Вызвать эти методы для каждого из
            объектов.
        Добавить конструктор в класс Phone, который принимает на вход три
        параметра для инициализации переменных класса - number, model и
        weight.
        Добавить конструктор, который принимает на вход два параметра для
        инициализации переменных класса - number, model.
        Добавить конструктор без параметров.

        Вызвать из конструктора с тремя параметрами конструктор с двумя.
        Добавьте перегруженный метод receiveCall, который принимает два
        параметра - имя звонящего и номер телефона звонящего. Вызвать этот
        метод.
        Создать метод sendMessage с аргументами переменной длины. Данный
        метод принимает на вход номера телефонов, которым будет отправлено
        сообщение. Метод выводит на консоль номера этих телефонов.*/

public class Main
{
    public static void main(String[] args)
    {
        Phone nokia = new Phone();
        nokia.setNumber("+ 375 33 657-74-92");
        nokia.setModel("3310n");
        nokia.setWeight(100.20f);

        Phone samsung = new Phone();
        samsung.setNumber("+ 375 29 657-65-31");
        samsung.setModel("galaxy s5");
        samsung.setWeight(110.20f);

        Phone motorola = new Phone();
        motorola.setNumber("+ 48 577-356-011");
        motorola.setModel("razr w3");
        motorola.setWeight(115.20f);

        System.out.println("nokia nuber:" + nokia.getNumber()+" model:" + nokia.getModel() + " weight:" + nokia.getWeight());
        System.out.println("samsung nuber:" + samsung.getNumber() + " model:" + nokia.getModel() + " weight:" + samsung.getWeight());
        System.out.println("motorola nuber:" + motorola.getNumber() + " model:" + motorola.getModel() + " weight:" + motorola.getWeight());

        nokia.receiveCall("Vasia");
        samsung.receiveCall("Igor");
        motorola.receiveCall("Maxim");

        samsung.sendMessage("hello ", "hi", "whats up ");
    }
}
