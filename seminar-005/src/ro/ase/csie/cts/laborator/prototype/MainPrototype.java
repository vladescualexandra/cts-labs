package ro.ase.csie.cts.laborator.prototype;

public class MainPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Caracter3D caracter1 = new Caracter3D("model1.3d");
//        Caracter3D caracter2 = new Caracter3D("model1.3d");
//        Caracter3D caracter3 = new Caracter3D("model1.3d");

        Caracter3D caracter1 = new Caracter3D("model1.3d");
        Caracter3D caracter2 = (Caracter3D) caracter1.clone();
        Caracter3D caracter3 = (Caracter3D) caracter1.clone();

        System.out.println("Done.");
    }
}
