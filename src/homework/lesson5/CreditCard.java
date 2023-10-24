package homework.lesson5;

public class CreditCard {
    String accountNumber;
    float currentAmount;
    public CreditCard(String accountNumber, float currentAmount)
    {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }
    void refill(float cash)
    {
        this.currentAmount += cash;
    }
    void withdrawals(float cash)
    {
        this.currentAmount -= cash;
    }
    void info()
    {
        System.out.println("Account:" + '\n' + accountNumber + '\n' + currentAmount);
    }
}
