package lsp;

public interface WithdrawableAccount extends NonWithdrawableAccount {
    void withdraw(float amount);
}
