package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightModel3D implements InterfataFlyweightModel3D {

    // stare permanenta - intrinseca / interna flyweight
    String fisierModel;
    String numeModel;
    List<Integer> puncte;

    public FlyweightModel3D(String fisierModel, String numeModel) {
        this.fisierModel = fisierModel;
        this.numeModel = numeModel;
        this.puncte = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Generare punct.");
            puncte.add(new Random().nextInt(1000));
        }
    }

    // starea temporara este data de detalii - extrinseca / ext fw
    @Override
    public void afisareEcran(DetaliiAfisare detalii) {
        System.out.println("Afisare model 3D pentru " + numeModel);
        System.out.println("Puncte: " + this.puncte);
        System.out.println(String.format("Coords: (%d, %d), culoare: %s",
                detalii.x, detalii.y, detalii.culoare));
    }
}
