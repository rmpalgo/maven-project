import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Before
    public void testIfHashIsPresent() {
        assertEquals(null, CodeupCrypt.hash);
    }

    @Test
    public void testIfHashPasswordSetsHash(){
        CodeupCrypt.hashPassword("fer");
        assertEquals("f3r", CodeupCrypt.hash);
    }

    @Test
    public void testIfCheckPasswordWorks() {
        assertTrue(CodeupCrypt.checkPassword("fer", "f3r"));
        assertTrue(CodeupCrypt.checkPassword("codeup", "c0d39p"));
    }

}
