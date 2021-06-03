package ro.ase.csie.cts.laborator.teste;

import org.junit.*;
import ro.ase.csie.cts.laborator.exceptii.ExceptieNota;
import ro.ase.csie.cts.laborator.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.laborator.modele.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TestStudentPart2 {

    private static final String NUME_INITIAL = "Gigel";
    private static final int VARSTA_INITIALA = 21;
    // Text fixture - date de care ai nevoie pentru test.
    private static Student student;
    private static ArrayList<Integer> note;

    @BeforeClass
    public static void setUpBeforeClass() {
        note = new ArrayList<>(Arrays.asList(7, 4, 6));
    }

    @AfterClass
    public static void tearDownAfterClass() {

    }

    @Before
    public void setUp() {
        student = new Student(NUME_INITIAL, VARSTA_INITIALA, note);
    }

    @After
    public void tearDown() {
        student = null;
    }

    @Test(expected = ExceptieVarsta.class)
    public void setTestVarstaRangeValoriNegative() throws ExceptieVarsta {
        int varstaNoua = Integer.MIN_VALUE;
        student.setVarsta(varstaNoua);
    }

    @Test(expected = ExceptieVarsta.class)
    public void testSetVarstaRangeValoarePozitivaMare() throws ExceptieVarsta {
        int varstaNoua = 200;
        student.setVarsta(varstaNoua);
    }

    @Test
    public void testSetVarstaBoundaryLimitaInferioara() throws ExceptieVarsta {
        int varstaNoua = Student.MIN_VARSTA;
        student.setVarsta(varstaNoua);
        int varstaStudent = student.getVarsta();
        assertEquals("Test pt varsta minima", varstaNoua, varstaStudent);
    }

    @Test
    public void testSetVarstaBoundaryLimitaSuperioara() throws ExceptieVarsta {
        int varstaNoua = Student.MAX_VARSTA;
        student.setVarsta(varstaNoua);
        int varstaStudent = student.getVarsta();
        assertEquals("Test pt varsta maxima", varstaNoua, varstaStudent);
    }

    @Test
    public void testSetNoteReferenceDeepCopy() throws ExceptieNota {
        int[] noteStudent = new int[]{9, 9, 10};
        ArrayList<Integer> referintaNote = new ArrayList<>(Arrays.asList(9, 9, 10));
        student.setNote(referintaNote);
        referintaNote.set(0, 5);

        int noteExistente[] = new int[student.getNrNote()];
        for (int i = 0; i < student.getNrNote(); i++) {
            noteExistente[i] = student.getNota(i);
        }

        assertArrayEquals("Test shallow copy pe setNote", noteStudent, noteExistente);
    }



}