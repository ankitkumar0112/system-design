package solidprinciples.lsp;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Client client = new Client();
        WithdrawableAccount savingAcc = new SavingsAccount();
        WithdrawableAccount currentAcc = new CurrentAccount();
        NonWithdrawableAccount fixedDepositAcc = new FixedDepositAccount();
        savingAcc.deposit(130);
        fixedDepositAcc.deposit(15000);
        currentAcc.deposit(1330);
    }
}
