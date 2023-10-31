package homework.lesson7.interfacePosition;

public class Accountant implements Position
{
    @Override
    public void sendMessage()
    {
        System.out.println("Accountant");
    }
}
