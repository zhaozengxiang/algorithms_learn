package homework.week5;

/**
 * 8. 字符串转换整数 (atoi)
 */
public class MyAtoi {

    public static void main(String[] args) {

    }
    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int index = 0, sign = 1, total = 0;
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        if (index == s.length()) {
            return 0;
        }
        char first = s.charAt(index);
        if (first == '+' || first == '-') {
            sign = first == '-' ? -1 : 1;
            index++;
        }

        while (index < s.length()) {
            int digit = s.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }
            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            total = total * 10 + digit;
            index++;
        }
        return total * sign;
    }
}
