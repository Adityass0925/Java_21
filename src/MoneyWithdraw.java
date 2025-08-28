package src;

public class MoneyWithdraw {
    public static void main(String[] args){
        Bank user =new Bank();
        try{
            user.withdraw(5000);
            user.withdraw(10000);
        }catch(InsuffucientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
