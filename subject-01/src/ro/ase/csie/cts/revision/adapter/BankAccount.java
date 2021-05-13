package ro.ase.csie.cts.revision.adapter;

public class BankAccount implements InterfataBankAccount {

    double balance;
    String id;

    public BankAccount() {
    }

    public BankAccount(double balance, String id) {
        this.balance = balance;
        this.id = id;
    }

    @Override
    public void accountTransfer(InterfataBankAccount account, double amount) {
        System.out.println("Account transfer.");
    }
}
