package april20.bank;

public class Bank {
    String accountInfo;
    int accountNumber;

    public Bank(String accountInfo, int accountNumber) {
        this.accountInfo = accountInfo;
        this.accountNumber = accountNumber;
    }

    public void printBankDetails(){
        System.out.println(accountInfo);
        System.out.println("accountNumber");
    }

}
