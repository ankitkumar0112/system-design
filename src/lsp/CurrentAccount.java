package lsp;

public class CurrentAccount implements WithdrawableAccount {

    private float balance = 0;

    @Override
    public void deposit(float amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in current account.");
    }

    @Override
    public void withdraw(float amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from current account. Current balance : " + balance);
        } else {
            throw new RuntimeException("Insufficient funds");
        }
    }
}
