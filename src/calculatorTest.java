import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class calculatorTest {

    @Before 
    public void setup() {
        calculator obj = new calculator() ;
    }
    
    @Test 
    public void test01() {
        assertEquals(5, obj.addNumbers(2, 3)) ;
    }

    @Test 
    public void test02() {
        assertEquals(5, obj.addNumbers(10, 2)) ;
    }

}
