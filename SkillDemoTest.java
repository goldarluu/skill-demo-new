import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test 
    public void multiply() {
        assertEquals(2, SkillDemo.multiplication(2,1)); // this will fail for sure 
    }
}
