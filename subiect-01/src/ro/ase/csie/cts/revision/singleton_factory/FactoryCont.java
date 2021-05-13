package ro.ase.csie.cts.revision.singleton_factory;

import javax.naming.OperationNotSupportedException;

public class FactoryCont {

    private final static String CONT_DEBIT = "debit";
    private final static String CONT_CREDIT = "credit";

    public static InterfataContBancar getContBancar(String tipCont) throws OperationNotSupportedException {
        switch (tipCont) {
            case CONT_CREDIT:
                return new ContCredit();
            case CONT_DEBIT:
                return new ContDebit();
            default:
                throw new OperationNotSupportedException();
        }
    }
}
