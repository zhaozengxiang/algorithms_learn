package homework.week4;

/**
 * 190. 颠倒二进制位
 */
public class ReverseBits {
    public static void main(String[] args) {

    }

    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) + (n >> i & 1);
        }
        return res;
    }
}
