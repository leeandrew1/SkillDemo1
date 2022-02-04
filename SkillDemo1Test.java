import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    @Test
    public void checkLength() {
        assertEquals(5, SkillDemo1.lengthOfString("asdfg"));
    }
}
