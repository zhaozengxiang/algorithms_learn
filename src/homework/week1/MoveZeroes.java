package homework.week1;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes1(nums);
        System.out.println(Arrays.toString(nums));
        String a = "abc";
        char[] arr = a.toCharArray();
    }

    //双指针解决
    public static void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                //当i > j时说明j当前指向的数字为0，可以进行交换
                if (i > j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                //只有当前数字不为0的时候 i和j共同前进 否则 只有i前进
                j++;
            }
        }
    }

    //暴力双重循环解决
    public static void moveZeroes1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == 0) {
                    continue;
                }
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
