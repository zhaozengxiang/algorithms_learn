package homework.week4;

/**
 * 191. 位1的个数
 */
public class HammingWeight {
    public static void main(String[] args) {

    }
    public static int hammingWeight(int n) {
        int res = 0;
        System.out.println(n);
        while (n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }
}
