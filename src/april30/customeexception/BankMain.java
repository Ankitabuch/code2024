package april30.customeexception;

public class BankMain {
    public static void main(String[] args){

        Bank bank = new Bank();
        double balance = bank.getBalance();
        System.out.println("current Balance :" + balance);

        double updatedBalance = bank.deposite(200);
        System.out.println("Balance After deposite:" +  updatedBalance);

        double withdrawBalance = bank.withdraw(200);
        System.out.println("Balance After withdraw:" +  withdrawBalance);

    }
}
