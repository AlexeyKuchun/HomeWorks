package homework.lesson7.interfacePosition;

public class Worker implements Position
{
    @Override
    public void sendMessage()
    {
        System.out.println("Worker");
    }
}
