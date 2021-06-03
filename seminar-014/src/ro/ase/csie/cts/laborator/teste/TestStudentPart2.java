package ro.ase.csie.cts.laborator.teste;

import org.junit.*;
import org.junit.experimental.categories.Category;
import ro.ase.csie.cts.laborator.exceptii.ExceptieNota;
import ro.ase.csie.cts.laborator.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.laborator.modele.Student;

import java.util.*;

import static org.junit.Assert.*;

public class TestStudentPart2 {

    private static final String NUME_INITIAL = "Gigel";
    private static final int VARSTA_INITIALA = 21;
    // Text fixture - date de care ai nevoie pentru test.
    private static Student student;
    private static ArrayList<Integer> note;
    private static ArrayList<Integer> noteRandom = new ArrayList<>();

    @BeforeClass
    public static void setUpBeforeClass() {
        note = new ArrayList<>(Arrays.asList(7, 4, 6));

        int nrNote = (int) 1e6;
        Random random = new Random();
        for (int i = 0; i < nrNote; i++) {
            noteRandom.add(random.nextInt(Student.MAX_NOTA) + 1);
        }
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

    @Category({CategoryTestPerformanta.class, CategoryTesteImportante.class})
    @Test
    public void testGetMediePerformance() throws ExceptieNota {
        student.setNote(noteRandom);

        long tStart = System.currentTimeMillis();
        student.getMedie();
        long tFinal = System.currentTimeMillis();

        long durata = tFinal - tStart;
        if (durata <= 20) {
            assertTrue(true);
        } else {
            fail("Calculul mediei dureaza mai mult de 10 milisecunde.");
        }

    }

    @Category(CategoryTestPerformanta.class)
    @Test(timeout = 30)
    public void testGetMediePerformanceTimeout() throws ExceptieNota {
        student.setNote(noteRandom);
        student.getMedie();
    }

    @Category(CategoryTesteImportante.class)
    @Test
    public void testSetVarstaInverse() throws ExceptieVarsta {
        int varstaNoua = VARSTA_INITIALA + 1;
        student.setVarsta(varstaNoua);

        assertNotEquals("set nu modifica valoarea atributului",
                VARSTA_INITIALA, student.getVarsta());

    }

    @Category(CategoryTesteImportante.class)
    @Test
    public void testGetNotaMinima() throws ExceptieNota {
        ArrayList<Integer> note = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            note.add(new Random().nextInt(Student.MAX_NOTA) + 1);
        }

        student.setNote(note);

        int notaMinima = student.getNotaMinima();

        for (int i = 0; i < student.getNrNote(); i++) {
            if (notaMinima > student.getNota(i)) {
                fail("Minimul nu este calculat corect.");
            }
        }

        assertTrue(true);
    }

    @Category(CategoryTesteImportante.class)
    @Test
    public void testGetNotaMinimaCross() throws ExceptieNota {
        ArrayList<Integer> note = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            note.add(new Random().nextInt(Student.MAX_NOTA) + 1);
        }

        student.setNote(note);

        int notaMinima = Collections.min(note);
        int notaminimaCalculata = student.getNotaMinima();

        assertEquals("Nota minima nu este ok", notaMinima, notaminimaCalculata);


    }

}