package april23.adstract;

public class BankMain {
    public static void main(String[] args) {
        BankOFcanada scotiaBank = new ScotiaBank(); // Upcasting
        BankOFcanada bmo = new Bmo();
        BankOFcanada rbc = new RBC();

       System.out.println("ScotiaBank interest rate: " + scotiaBank.rateOfInterest());
        System.out.println("BMO interest rate: " + bmo.rateOfInterest());
        System.out.println("RBC interest rate: " + rbc.rateOfInterest());
    }
}
