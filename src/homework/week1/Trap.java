package homework.week1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Trap {
    public static void main(String[] args) {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        if(height == null) {
            return 0;
        }
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int result = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] < height[i]) {
                //当前最低点的高度 可以放下雨水
                int curIndex = stack.pop();
                while (!stack.isEmpty() && height[stack.peek()] == height[curIndex]) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {
                    int stackTop = stack.peek();
                    //使用当前柱子的高度和左侧柱子高度的最小值减去curIndex的高度得到雨水的高度
                    result += (Math.min(height[stackTop], height[i]) - height[curIndex]) * (i - stackTop - 1);
                }
            }
            stack.push(i);
        }
        return result;
    }
}
