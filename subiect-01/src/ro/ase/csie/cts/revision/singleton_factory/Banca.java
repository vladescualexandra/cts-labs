package ro.ase.csie.cts.revision.singleton_factory;

import javax.naming.OperationNotSupportedException;

public class Banca {

    public static Banca banca = null;
    protected static int CONTOR_CONTURI = 0;
    protected String denumire;
    protected String adresa;

    private Banca() {
    }

    private Banca(String denumire, String adresa) {
        this.denumire = denumire;
        this.adresa = adresa;
    }

    public static synchronized Banca getBanca(String denumire, String adresa) {
        if (banca == null) {
            banca = new Banca(denumire, adresa);
        }
        return banca;
    }

    public InterfataContBancar genereazaCont(String tip) throws OperationNotSupportedException {
        CONTOR_CONTURI++;
        return FactoryCont.getContBancar(tip);
    }

    @Override
    public String toString() {
        return "Banca{" +
                "denumire='" + denumire + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}
