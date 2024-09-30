public class BankAcoount {
    String accountNumber;
    long balance;
    double interestRate;
    BankAcoount()
    {

    }

    public BankAcoount(String accountNumber, long balance, double interestRate) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    public void deposit(long amount) {
        balance = balance + amount;
        System.out.println(+amount+" deposited to "+accountNumber+" and current balance is "+balance);
    }
    public void withdraw(long amount) {
        if(balance >= amount) {
            balance = balance - amount;
            System.out.println(+amount+" withdrawn from "+accountNumber+" and current balance is "+balance);
        }
        else {
            System.out.println("insufficient balance");
        }
    }
    public void CalculateInterest() {
        double interest = balance * interestRate;
        System.out.println(" interest is "+interest);
        System.out.println(" interest rate is "+interestRate);
    }

}
