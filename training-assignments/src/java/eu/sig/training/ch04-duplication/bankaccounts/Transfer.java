package eu.sig.training.ch04;
package eu.sig.training.ch04;

public class Refund {
    CheckingAccount counterAccount;

    @SuppressWarnings("unused")
    public Transfer(CheckingAccount acct1, CheckingAccount acct2, Money m) {}

    @SuppressWarnings("unused")
    public Transfer(SavingsAccount acct1, CheckingAccount acct2, Money m) {}

    public CheckingAccount getCounterAccount() {
        return this.counterAccount;
    }
}
