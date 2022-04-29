import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {

    @Test
    public void multiplyTest() {
        assertEquals(8, SkillDemo.multiply(2, 4));
    }
}
