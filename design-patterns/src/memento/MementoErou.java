package memento;

import java.util.Date;

public class MementoErou {

    String nume;
    int puncteViata;
    String magie;

    Date dataSalvare;

    public MementoErou(String nume, int puncteViata, String magie) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.magie = magie;
        this.dataSalvare = new Date();
    }


}
