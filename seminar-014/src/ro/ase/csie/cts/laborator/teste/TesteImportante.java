package ro.ase.csie.cts.laborator.teste;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(CategoryTesteImportante.class)
@Suite.SuiteClasses({TestStudent.class, TestStudentPart2.class})
public class TesteImportante {
}
