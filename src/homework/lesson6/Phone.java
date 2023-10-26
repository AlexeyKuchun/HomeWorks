package homework.lesson6;

public class Phone {
    private String number;
    private String model;
    private float weight;

    public Phone(String number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String callName) {
        System.out.println("Calling " + callName);
    }

    public void receiveCall(String callName, String number) {
        System.out.println("Call: " + callName + "," + " Number: " + number);
    }
    public Phone() {
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


    public void sendMessage(String... message)
    {
        System.out.println("Send message to: ");
        for ( int i = 0 ; i<message.length; i++)
        {
            System.out.println(message[i]);
        }
    }
}
