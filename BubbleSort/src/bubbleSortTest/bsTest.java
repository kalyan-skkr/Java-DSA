package bubbleSortTest;

import bubbleSortPkg.helper;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class bsTest {

    helper helper = new helper();

    @Test
    public void testAscending(){
        int[] a = helper.sortAscending(new int[]{3,1,2,4});
        assertEquals(1, a[0]);
        assertEquals(2, a[1]);
        assertEquals(3, a[2]);
        assertEquals(4, a[3]);

        a = helper.sortDescending(new int[]{3,1,2,4});
        assertEquals(4,a[0]);
        assertEquals(3,a[1]);
        assertEquals(2,a[2]);
        assertEquals(1,a[3]);
    }
}
