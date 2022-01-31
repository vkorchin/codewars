package bonus;

import org.junit.Test;

import static org.junit.Assert.*;

public class BonusTest {
    private static boolean verif(long[] ls, long s) {
        long t = 0;
        for (long l : ls) t += l;
        return t == s;
    }

    private static void dotest(int[] arr, long s, long[] expect) {
        long[] actual = Bonus.bonus(arr, s);
        boolean v = verif(actual, s);
        if (!v) {
            long t = 0;
            for (long l : actual) t += l;
            System.out.println("The sum of your result is not 's': you got " + t + " instead of " + s);
            assertTrue("The sum of your resulting array is not 'total bonus'", v);
        } else {
            assertArrayEquals(expect, actual);
        }
    }

    @Test
    public void test1() {
        dotest(new int[]{22, 3, 15}, 18228, new long[]{1860, 13640, 2728});
        dotest(new int[]{8, 14, 11}, 23541, new long[]{10241, 5852, 7448});
        dotest(new int[]{8, 20, 17}, 25281, new long[]{13515, 5406, 6360});
        dotest(new int[]{6, 15, 23}, 22156, new long[]{13340, 5336, 3480});
        dotest(new int[]{7, 9, 12}, 10880, new long[]{4608, 3584, 2688});
        dotest(new int[]{30, 27, 8, 14, 7}, 34067, new long[]{2772, 3080, 10395, 5940, 11880});
        dotest(new int[]{25, 22, 15, 22, 22}, 5213, new long[]{858, 975, 1430, 975, 975});
    }
}
