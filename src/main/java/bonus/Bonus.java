package bonus;

import static java.util.stream.IntStream.of;

public class Bonus {

    public static long[] bonus(int[] arr, long s) {
        long count = of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w % 2 == 0).count();
        double sum = of(arr).mapToDouble(i -> i).reduce(0, (t, n) -> t + 1 / n);

        double multiply = 0.0;
        for (int j : arr) {
            multiply += (1.0) / j;
        }
        long[] result = new long[arr.length];
        for(int i = 0; i < result.length; i++) {
            result[i] = Math.round(((s * 1.0)) / (arr[i] * multiply));
        }
        return result;
//        return of(arr).mapToLong(e -> Math.round(s / (sum * e))).toArray();
    }
}
