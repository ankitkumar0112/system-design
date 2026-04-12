package lsp;

import java.util.List;

public class Client {
    List<NonWithdrawableAccount> nonWithdrawableAccounts;
    List<WithdrawableAccount> withdrawableAccounts;

    public Client(List<NonWithdrawableAccount> nonWithdrawableAccounts, List<WithdrawableAccount> withdrawableAccounts) {
        this.nonWithdrawableAccounts = nonWithdrawableAccounts;
        this.withdrawableAccounts = withdrawableAccounts;
    }

    public void processNonWithdrawalTransactions() {
        for (NonWithdrawableAccount nonWithdrawableAccount : nonWithdrawableAccounts) {
            nonWithdrawableAccount.deposit(1250);
        }
    }

    public void processWithdrawalTransactions() {
        for (WithdrawableAccount withdrawableAccount : withdrawableAccounts) {
            withdrawableAccount.deposit(1222);
            withdrawableAccount.deposit(1000);
            withdrawableAccount.withdraw(1000);
        }
    }
}
