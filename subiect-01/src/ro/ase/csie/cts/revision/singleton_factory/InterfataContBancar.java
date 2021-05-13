package ro.ase.csie.cts.revision.singleton_factory;

public interface InterfataContBancar {

    public void transfer(InterfataContBancar destinatie, double suma);

    public void depune(double suma);
}
