package homework.week2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 46.全排列
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 */

public class Permute {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        permute(nums,result,list);
        return result;

    }
    private void permute(int[] nums,List<List<Integer>> result,LinkedList<Integer> list) {
        if (nums.length == list.size()) {
            result.add(new LinkedList<>(list));
            return;
        }
        for (int i = 0; i < nums.length;i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            permute(nums,result,list);
            list.removeLast();
        }
    }
}
