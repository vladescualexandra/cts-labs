package ro.ase.csie.cts.laborator.teste;

import org.junit.*;
import ro.ase.csie.cts.laborator.exceptii.ExceptieNota;
import ro.ase.csie.cts.laborator.exceptii.ExceptieNume;
import ro.ase.csie.cts.laborator.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.laborator.modele.Student;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestStudent {

    private static final String NUME_INITIAL = "Gigel";
    private static final int VARSTA_INITIALA = 21;
    // Text fixture - date de care ai nevoie pentru test.
    private static Student student;
    private static ArrayList<Integer> note;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        note = new ArrayList<>();
        note.add(9);
        note.add(7);
        note.add(10);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        note.clear();
        note = null;
    }

    @Before
    public void setUp() throws Exception {
        student = new Student(NUME_INITIAL, VARSTA_INITIALA, note);
    }

    @After
    public void tearDown() throws Exception {
        student = null;
    }

    @Ignore
    @Test
    public void test() {
        fail("Not implemented");
    }

    @Test
    public void testSetVarstaConformanceRight() throws ExceptieVarsta {

        int varstaNoua = 23;
        student.setVarsta(varstaNoua);

        assertEquals("Test cu valori corecte. ", varstaNoua, student.getVarsta());
    }

    @Test
    public void testSetNumeConformanceRight() {
        String numeNou = "Ana";
        try {
            student.setNume(numeNou);
            assertEquals("Test cu valori corecte.", numeNou, student.getNume());
        } catch (ExceptieNume exceptieNume) {
            fail("Genereaza exceptie pentru valori corecte.");
        }
    }

    @Test
    public void setTestVarstaErrorCondition() {
        int varstaNoua = Student.MIN_VARSTA - 1;
        try {
            student.setVarsta(varstaNoua);
            fail("Nu genereaza exceptie pentru varsta in afara limitelor. :(");
        } catch (ExceptieVarsta exceptieVarsta) {
            assertTrue(true);
        }
    }

    @Test(expected = ExceptieNume.class)
    public void testSetNumeErrorCondition() throws ExceptieNume {
        String numeNou = "Io";
        student.setNume(numeNou);
    }

    @Test
    public void testGetNotaMinimaOrderingSetSortatCrescator() throws ExceptieNota {
        int notaMinima = 4;
        ArrayList<Integer> note = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            note.add(i + notaMinima);
        }

        student.setNote(note);

        int notaMinimaCalculata = student.getNotaMinima();
        assertEquals("Test cu valori sortate crescator.", notaMinima, notaMinimaCalculata);

    }

    @Test
    public void testGetNotaMinimaCardinalityZero() throws ExceptieNota {
        ArrayList<Integer> note = new ArrayList<>();
        student.setNote(note);

        int notaMinima = 0;
        int notaMinimaCalculata = student.getNotaMinima();

        assertEquals("Test fara note.", notaMinima, notaMinimaCalculata);

    }

    @Test
    public void testGetNotaMinimaCardinalityUnu() throws ExceptieNota {
        ArrayList<Integer> note = new ArrayList<>();
        note.add(Student.MAX_NOTA);

        student.setNote(note);

        int notaMinima = Student.MAX_NOTA;
        int notaMinimaCalculata = student.getNotaMinima();
        assertEquals("Test cu o singura nota.", notaMinima, notaMinimaCalculata);

    }

    @Test
    public void testGetNotaMinimaExistenceNoteNull() throws ExceptieNota {
        student.setNote(null);
        int notaMinima = 0;
        int notaMinimaCalculata = student.getNotaMinima();
        assertEquals("Test cu vector null.", notaMinima, notaMinimaCalculata);
    }

}