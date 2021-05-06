package ro.ase.csie.cts.laborator.state;

public class StareDeplasareNormala implements InterfataModDeplasare {
    @Override
    public void seMisca(SuperErou erou) {
        System.out.println(erou.nume + " se deplaseaza normal.");
    }
}
