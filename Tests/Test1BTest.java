import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Test1BTest {
    private Test1B test2 = new Test1B();
    int[] a;



    @Test
    public void testBasic() {
      a = new int[]{3,5,1};
        assertEquals(9, test2.solution(a));
    }
    @Test
    public void testMoreThan10() {
        a = new int[]{3,10,1};
        try {
            assertEquals(9, test2.solution(a));
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
    @Test
    public void testLessThan0() {
        a = new int[]{3,-10,1};
        try {
            assertEquals(9, test2.solution(a));
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUninitialized() {
        a = null;
        try {
            assertEquals(9, test2.solution(a));
        } catch (NullPointerException e){
            System.out.println(e);
        }
    }
    @Test
    public void testWithZeroAtFront() {
        a = new int[]{3,5,0,0,0};
        assertEquals(10, test2.solution(a));
    }
    @Test 
    public void testEmpty() {
        a = new int[]{};
             test2.solution(a);
    }
    @Test
    public void testOutOfIntCapacity() {
        a = new int[]{8,6,5,2,2,3,6,2,1};
        try {
            assertEquals(46, test2.solution(a));
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}