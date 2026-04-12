package lsp;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        List<WithdrawableAccount> withdrawableAccounts = new ArrayList<>();
        withdrawableAccounts.add(new SavingsAccount());
        withdrawableAccounts.add(new CurrentAccount());

        List<NonWithdrawableAccount> nonWithdrawableAccounts = new ArrayList<>();
        nonWithdrawableAccounts.add(new FixedDepositAccount());
        Client client = new Client(nonWithdrawableAccounts, withdrawableAccounts);
        client.processNonWithdrawalTransactions();
        client.processWithdrawalTransactions();
    }
}
