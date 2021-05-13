package ro.ase.csie.cts.revision.adapter;

import ro.ase.csie.cts.revision.singleton_factory.ContDebit;
import ro.ase.csie.cts.revision.singleton_factory.InterfataContBancar;

public class AdapterCBtoBA implements InterfataBankAccount {

    InterfataContBancar contBancar;

    public AdapterCBtoBA(InterfataContBancar contBancar) {
        this.contBancar = contBancar;
    }

    @Override
    public void accountTransfer(InterfataBankAccount account, double amount) {
        InterfataContBancar contDebit = conversie(account);
        this.contBancar.transfer(contDebit, amount);
    }

    private InterfataContBancar conversie(InterfataBankAccount account) {
        BankAccount bankAccount = (BankAccount) account;
        ContDebit contDebit = new ContDebit(bankAccount.balance, bankAccount.id);
        return contDebit;
    }
}
