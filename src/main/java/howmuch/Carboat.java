package howmuch;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Carboat {
    public static String howmuch(int m, int n) {
        return IntStream.rangeClosed(Integer.min(m, n), Integer.max(m, n))
                .filter(t -> (t-1) % 9 == 0 && (t-2) % 7 == 0)
                .mapToObj(t-> new Response(t, (t-2)/7, (t-1)/9))
                .collect(Collectors.toList()).toString().replace(", ", "");
    }

    static class Response{
        private final int money;
        private final int boat;
        private final int car;

        public Response(int money, int boat, int car) {
            this.money = money;
            this.boat = boat;
            this.car = car;
        }

        public String toString(){
            return "[M: " + money + " B: " + boat + " C: " + car + "]";
        }
    }
}
