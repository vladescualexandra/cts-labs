package ro.ase.csie.cts.laborator.builder;

public class TestBuilder {

    public static void main(String[] args) {

        // 1. Creare
//        SuperErou superErou1 = new SuperErou();
        // 2. Initializare
        // ...

//        SuperErou superErou2 = new SuperErou(
//                "Superman",
//                100,
//                false,
//                false,
//                new Arma(),
//                null,
//                null,
//                new PutereLaser()
//        );

        SuperErou batman = new SuperErou
                .SuperErouBuilder("Batman", 150)
                .build();

        SuperErou joker = new SuperErou
                .SuperErouBuilder("Joker", 300)
                .esteNegativ()
                .esteRanit()
                .build();


    }
}
