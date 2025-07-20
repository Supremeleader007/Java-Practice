import java.util.*;

public class Fibonnaci {

    static HashMap<Integer, Long> dict = new HashMap<>();
    static {
        dict.put(0, 1L);
        dict.put(1, 1L);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fibo(10000));
        System.out.println("Total time taken : " + (System.currentTimeMillis() - start));
    }

    static long fibo(int num) {
        if (!dict.containsKey(num)) {
            dict.put(num, fibo(num - 1) + fibo(num - 2));
        }
        return dict.get(num);
    }
}