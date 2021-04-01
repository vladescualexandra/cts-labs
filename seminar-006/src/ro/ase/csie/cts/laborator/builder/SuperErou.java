package ro.ase.csie.cts.laborator.builder;

public class SuperErou {

    private String nume;
    private int puncteViata;

    private boolean esteErouNegativ;
    private boolean esteRanit;

    private InterfataArma armaStanga;
    private InterfataArma armaDreapta;

    private InterfataSuperPutere superPutere;
    private InterfataSuperPutere superSuperPutere;

    private SuperErou() {

    }

    private SuperErou(String nume,
                     int puncteViata,
                     boolean esteErouNegativ,
                     boolean esteRanit,
                     InterfataArma armaStanga,
                     InterfataArma armaDreapta,
                     InterfataSuperPutere superPutere,
                     InterfataSuperPutere superSuperPutere) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.esteErouNegativ = esteErouNegativ;
        this.esteRanit = esteRanit;
        this.armaStanga = armaStanga;
        this.armaDreapta = armaDreapta;
        this.superPutere = superPutere;
        this.superSuperPutere = superSuperPutere;
    }

    public static class SuperErouBuilder {
        private SuperErou superErou = null;

        public SuperErouBuilder(String nume, int puncteViata) {
            this.superErou = new SuperErou();
            this.superErou.nume = nume;
            this.superErou.puncteViata = puncteViata;
        }

        public SuperErouBuilder esteNegativ() {
            this.superErou.esteErouNegativ = true;
            return this;
        }

       public SuperErouBuilder esteRanit() {
            this.superErou.esteRanit = true;
            return this;
       }

       public SuperErouBuilder setArmaStanga(InterfataArma arma) {
            this.superErou.armaStanga = arma;
            return this;
       }

        public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
            this.superErou.armaDreapta = arma;
            return this;
        }

        public SuperErouBuilder setSuperPutere(InterfataSuperPutere putere) {
            this.superErou.superPutere = putere;
            return this;
        }

        public SuperErouBuilder setSuperSuperPutere(InterfataSuperPutere putere) {
            this.superErou.superSuperPutere = putere;
            return this;
        }

        public SuperErou build() {
            return this.superErou;
        }

    }


}
