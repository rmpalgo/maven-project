import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    List<String> names;

    //
    @Before
    public void setUp() {
        this.names = new ArrayList<>();
        names.add("Fer");

    }

    @Test
    public void testIfStringMathces() {
        String actual = "Codeup";
        assertEquals("Codeup", actual);
        assertNotEquals("codeup", actual);
    }

    @Test
    public void testIfListsAreNotTheSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void TestIfArraysAreEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfWordContains() {
        String language = "PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }

    @Test
    public void testIfFerItInTheList() {
        assertEquals("Fer", names.get(0));
        assertNotEquals("Duglas", names.get(0));
    }





}
