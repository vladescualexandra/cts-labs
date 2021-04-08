package ro.ase.csie.cts.laborator.facade;

import ro.ase.csie.cts.laborator.facade.api.ConexiuneServerJoc;
import ro.ase.csie.cts.laborator.facade.api.Player;
import ro.ase.csie.cts.laborator.facade.api.ProfilPlayer;

public class FacadeAPIJoc {

    // interfata simplificata pentru a obtine profilul unui jucator
    public static String getProfil(String username,
                                   String password) {
        // 1. creare conexiune
        ConexiuneServerJoc conexiune = new ConexiuneServerJoc();
        conexiune.conectare();

        // 2. login player
        Player player = new Player();
        player.login(conexiune);

        // 3. obtinem profilul
        ProfilPlayer profilPlayer = player.getProfil();

        // 4. obtinem datele din profil
        String dateProfil = profilPlayer.getProfil();

        return dateProfil;
    }
}
