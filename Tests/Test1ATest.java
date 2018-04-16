import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.lang.System.*;

import static org.junit.jupiter.api.Assertions.*;

class Test1ATest {
    private List<Integer> arrayList = new ArrayList<>();
    private Test1A test1 = new Test1A();

    @Test
    public void testMaxValue() {
        arrayList.add(1000000);
        assertEquals(1, test1.solution(arrayList));
    }
    @Test
    public void testMinValue() {
        arrayList.add(-1000000);
        assertEquals(1, test1.solution(arrayList));
    }
    @Test
    public void testRandomValue() {
        arrayList.add(1);
        assertEquals(2, test1.solution(arrayList));
    }
    @Test
    public void testFewRandomMixedDuplicateValues() {
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(-16);
        arrayList.add(23);
        arrayList.add(-16);
        arrayList.add(135);
        assertEquals(1, test1.solution(arrayList));
    }
    @Test
    public void testFewRandomPositiveValues() {
        arrayList.add(7);
        arrayList.add(5);
        arrayList.add(12);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(23);
        arrayList.add(16);
        arrayList.add(135);
        assertEquals(2, test1.solution(arrayList));
    }
    @Test
    public void testFewRandomNegativeValues() {
        arrayList.add(-3);
        arrayList.add(-5);
        arrayList.add(-12);
        arrayList.add(-8);
        arrayList.add(-1);
        arrayList.add(-23);
        arrayList.add(-16);
        arrayList.add(-135);
        assertEquals(1, test1.solution(arrayList));
    }
    @Test
    public void testFewRandomTenZeroValues() {
        arrayList.add(-3);
        arrayList.add(5);
        arrayList.add(-12);
        arrayList.add(8);
        for(int i =0;i<10;i++)
            arrayList.add(0);
        assertEquals(1, test1.solution(arrayList));
    }
    @Test
    public void testValuesToMax() {
        for(int i =0;i<100000;i++)
            arrayList.add(i+1);
        assertEquals(100001, test1.solution(arrayList));
    }
    @Test
    public void testEmpty() {
        try {
            assertEquals(-1, test1.solution(arrayList));
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUninitialized() {
        List<Integer> unList = null;
        try {
            assertEquals(-1, test1.solution(unList));
        } catch (NullPointerException e){
            System.out.println(e);
        }
    }
    @Test
    public void testValuesOutOfRange() {
        for(int i =0;i<100001;i++)
            arrayList.add(i+1);
        try {
            assertEquals(-1, test1.solution(arrayList));
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }

}
    @Test
    public void testLessThanMinimum() {
        arrayList.add(-1000001);
        try {
            assertEquals(-1, test1.solution(arrayList));
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}