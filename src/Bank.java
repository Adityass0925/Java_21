package src;

public class Bank {
    private int balance =10000;
    public void withdraw(int amount) throws InsuffucientBalanceException{
        if(amount>balance)
        {
            throw new InsuffucientBalanceException("Not enough Balance");
        }
        else{
            balance-=amount;
            System.out.println("Withdrawal Successful, Remaining Balance"+ balance);
        }
    }
}
