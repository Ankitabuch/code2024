package april20.bank;

public class BankOfCanada extends Bank {
    int mortgateRate;


    public BankOfCanada(int mortgateRate, String accountInfo, int accountNumber) {
        super(accountInfo,accountNumber);
    }

}
