package ro.ase.csie.cts.laborator.junit.teste;

import org.junit.BeforeClass;
import org.junit.Test;
import ro.ase.csie.cts.laborator.junit.modele.OperatiiMatematice;

import static org.junit.Assert.*;

public class TestOperatiiMatematice {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        fail("Not implemented yet.");
    }

    @Test
    public void testSumaValoriNormale() {
        int a = 5;
        int b = 6;
        int sumaAsteptata = 11;
        int sumaCalculata = OperatiiMatematice.aduna(a, b);

        assertEquals("Test cu 5 si 6.", sumaAsteptata, sumaCalculata);
    }
}