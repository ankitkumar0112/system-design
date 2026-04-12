package lsp;

public class SavingsAccount implements WithdrawableAccount {
    private float balance;

    public SavingsAccount() {
        balance = 0;
    }

    @Override
    public void deposit(float amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in savings account.");
    }

    @Override
    public void withdraw(float amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from savings account. Current balance : " + balance);
        } else {
            throw new RuntimeException("Insufficient funds");
        }
    }

    public float fetchBalance() {
        return balance;
    }
}
