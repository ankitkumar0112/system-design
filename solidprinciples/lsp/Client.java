package solidprinciples.lsp;

import java.util.ArrayList;
import java.util.List;

public class Client {
    List<NonWithdrawableAccount> nonWithdrawableAccounts;
    List<WithdrawableAccount> withdrawableAccounts;

    public Client() {
        this.nonWithdrawableAccounts = new ArrayList<>();
        this.withdrawableAccounts = new ArrayList<>();
    }
}
