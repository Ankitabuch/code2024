package april27.annonymouclas;

public class Main {

    public static void main(String[] args){

        Bank bank = new Bank(){
            @Override
            void interest() {
               System.out.println("this is the interest rate:" + 5 );
            }
        };
        bank.interest();
    }
}
