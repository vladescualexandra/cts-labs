package ro.ase.csie.cts.laborator.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Caracter3D implements Cloneable {

    String fisierModel3D;
    String culoare;
    int inaltime;
    ArrayList<Integer> puncte;

    private Caracter3D() {

    }

    public Caracter3D(String fisierModel3D) {
        System.out.println("Se incarca modelul 3D din " + fisierModel3D);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.fisierModel3D = fisierModel3D;

        Random random = new Random();
        puncte = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            puncte.add(random.nextInt(1000));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Puncte Caracter3D: ");
        for (int punct : this.puncte) {
            sb.append(punct + " | ");
        }
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // NU ASA! Nu prin acelasi constructor, deoarece fix asta dorim sa evitam.
        // Caracter3D clona = new Caracter3D(this.fisierModel3D);

        Caracter3D clona = new Caracter3D();
        clona.culoare = this.culoare;
        clona.fisierModel3D = this.fisierModel3D;
        clona.inaltime = this.inaltime;
        clona.puncte = (ArrayList<Integer>) this.puncte.clone();

        return clona;
    }
}
