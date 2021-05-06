package ro.ase.csie.cts.laborator.chain;

public class MesajChat {

    String text;
    int prioritate;
    String destinatie;

    public MesajChat(String text, int prioritate, String destinatie) {
        this.text = text;
        this.prioritate = prioritate;
        this.destinatie = destinatie;
    }
}
