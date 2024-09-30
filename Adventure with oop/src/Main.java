public class Main {
    public static void main(String[] args) {
FixedDepositAcoount fd =new FixedDepositAcoount("N1",100000);
fd.deposit(5000);
fd.deposit(1000);
fd.withdraw(1000);
fd.CalculateInterest();
DPSAccount dps = new DPSAccount("N2",5000);
dps.deposit(5000);
dps.withdraw(5000);
dps.CalculateInterest();

SavingsAccount save = new SavingsAccount("N3",5000);
save.deposit(5000);
save.withdraw(1111000);
save.CalculateInterest();

    }
}