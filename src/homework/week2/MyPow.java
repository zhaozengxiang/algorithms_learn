package homework.week2;

/**
 * 50. Pow(x, n)
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。
 */
public class MyPow {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n < 0) {
            n = -n;
            x = 1/x;
        }
        long b = n;
        return myPow(x,b);
    }

    public double myPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double value = myPow(x,n / 2L);
        if (n % 2 == 0) {
            value = value * value;
        } else {
            value = value * value * x;
        }
        return value;
    }
}
