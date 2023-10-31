package homework.lesson7.interfacePosition;

public class Director implements Position
{
    @Override
    public void sendMessage()
    {
        System.out.println("Director");
    }
}
