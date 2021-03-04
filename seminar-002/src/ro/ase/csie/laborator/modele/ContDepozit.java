package ro.ase.csie.laborator.modele;

import ro.ase.csie.laborator.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.laborator.exceptii.ExceptieTransferIlegal;
import ro.ase.csie.laborator.interfete.Profitabil;

public class ContDepozit extends ContBancar implements Profitabil {

    public static final double BALANTA_MINIMA = 100;

    public ContDepozit(String iban) {
        super(BALANTA_MINIMA, iban);
    }

    @Override
    public void alimenteaza(Double valoare) {
        this.balanta += valoare;
    }

    @Override
    public void extrage(Double valoare) throws ExceptieFonduriInsuficiente {
        if (this.balanta < valoare) {
            throw new ExceptieFonduriInsuficiente("Nu ai bani suficienti.");
        } else {
            this.balanta -= valoare;
        }
    }

    @Override
    public void transfer(Double valoare, Cont destinatie) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {
        if (this == destinatie) {
            throw new ExceptieTransferIlegal();
        } else {
            this.extrage(valoare);
            destinatie.alimenteaza(valoare);
        }

    }

    @Override
    public void adaugaDobanda(double procentDobanda) {
        this.balanta += (1 + procentDobanda / 100);
    }
}
