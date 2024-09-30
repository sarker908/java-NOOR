public class FixedDepositAcoount extends BankAcoount {
    FixedDepositAcoount(String acccountNumber,long balance)
    {
        super(acccountNumber,balance,0.005);
    }
}
