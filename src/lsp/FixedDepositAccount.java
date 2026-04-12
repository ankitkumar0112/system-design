package lsp;

public class FixedDepositAccount implements NonWithdrawableAccount {
    private float balance;

    public FixedDepositAccount() {
        balance = 0;
    }

    @Override
    public void deposit(float amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in fixed deposit account.");
    }
}
