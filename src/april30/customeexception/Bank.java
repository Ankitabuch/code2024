package april30.customeexception;

public class Bank {

    double balance = 1500;

    double getBalance(){
        return balance;
    }

    public double deposite(double depositeAmount){
        balance =balance + depositeAmount;
        return balance;
    }

    public double withdraw(double withdrawAmount){
        if (withdrawAmount > balance){
            throw new InsufficientBalanceException("insufficientBalance");
        }
        balance = balance - withdrawAmount;
        return balance;
    }

}
