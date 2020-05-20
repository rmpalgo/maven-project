import org.junit.Test;
import static org.junit.Assert.*;

public class MyMathTest {

@Test
public void testIfSumWorks() {
    assertEquals(2, MyMath.sum(1,1));
    assertEquals(5, MyMath.sum(2,3));
}

@Test
    public void testIfSubWorks() {
    assertEquals(7.8, MyMath.sub(10.0, 2.2), 0);
}

}
