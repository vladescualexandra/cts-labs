package ro.ase.csie.cts.laborator.observer;

import java.util.ArrayList;
import java.util.List;

public class ModulStareConexiuneServer {

    List<InterfataStatusConexiuneServer> module
            = new ArrayList<>();

    public void register(InterfataStatusConexiuneServer modul) {
        this.module.add(modul);
    }

    public void unregister(InterfataStatusConexiuneServer modul) {
        this.module.remove(modul);
    }

    public void detectieSchimbareStareConexiune(StareConexiune stare) {
        if (stare.equals(StareConexiune.ACTIVA)) {
            for (InterfataStatusConexiuneServer modul : module) {
                modul.conexiuneActiva();
            }
        } else if (stare.equals(StareConexiune.INACTIVA)) {
            for (InterfataStatusConexiuneServer modul : module) {
                modul.conexiuneIntrerupta();
            }
        }
    }


}
