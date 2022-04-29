import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {

    @Test
    public void multiplyTest() {
        AssertEquals(6, SkillDemo.multiply(2, 4));
    }
}
