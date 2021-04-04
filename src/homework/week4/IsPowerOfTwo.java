package homework.week4;

/**
 * 231. 2的幂
 */
public class IsPowerOfTwo {
    public static void main(String[] args) {
    }
    
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
