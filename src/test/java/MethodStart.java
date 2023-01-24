import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import service.Condition;
import service.Icondition;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Description("Method for start")
public class MethodStart {
    private Icondition icondition;
    @Test
    public void runTest() {
        icondition=new Condition();
        assertTrue(icondition.run(1,19));
        System.out.println("Run test");
    }
    @Test
    public void jumpTest() {
        icondition=new Condition();
        assertTrue(icondition.jump( 4,10));
        System.out.println("Jump test");
    }

}
