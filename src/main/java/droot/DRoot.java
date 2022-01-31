package droot;

public class DRoot {
    public static int digital_root(int n) {
        while(n/10 !=0){
            n = String.valueOf(n).chars().reduce(0, (x,y) -> x + Character.getNumericValue(y));
        }
        return n;
    }
}
