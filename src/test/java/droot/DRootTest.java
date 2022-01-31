package droot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DRootTest {

    private void doTest(int expext, int param){
        assertEquals( "Nope!" , expext, DRoot.digital_root(param));
    }

    @Test
    public void test() {
        doTest(7, 16);
        doTest(6, 456);
    }
}