package ro.ase.csie.cts.revision;

import ro.ase.csie.cts.revision.adapter.AdapterCBtoBA;
import ro.ase.csie.cts.revision.adapter.BankAccount;
import ro.ase.csie.cts.revision.adapter.InterfataBankAccount;
import ro.ase.csie.cts.revision.singleton_factory.Banca;
import ro.ase.csie.cts.revision.singleton_factory.ContDebit;
import ro.ase.csie.cts.revision.singleton_factory.InterfataContBancar;

import javax.naming.OperationNotSupportedException;

public class Test {

    public static void main(String[] args) throws OperationNotSupportedException {
        /* Test Singleton */
//        Banca banca = new Banca(); <-- EROARE DE COMPILARE
//        Banca banca = new Banca("denumire", "adresa"); <-- EROARE DE COMPILARE
        Banca banca = Banca.getBanca("BCR", "Romana 15");
        Banca banca2 = Banca.getBanca("ING", "Victoriei 20");

        System.out.println(banca);
        System.out.println(banca2);

        if (banca == banca2) {
            System.out.println("Aceeasi banca");
        } else {
            System.out.println("Banci diferite");
        }

        /* Test Factory */
        InterfataContBancar contBancar1 = banca.genereazaCont("credit");
        InterfataContBancar contBancar2 = banca.genereazaCont("credit");
        InterfataContBancar contBancar3 = banca.genereazaCont("debit");

        contBancar1.depune(123.4);
        contBancar2.depune(200);
        contBancar3.depune(400);

        /* Test Adapter */
        ContDebit contDebit = new ContDebit(200,"ABJ132");
        InterfataBankAccount account = new AdapterCBtoBA(contDebit);
        account.accountTransfer(new BankAccount(), 50);


    }
}
