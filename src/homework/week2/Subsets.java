package homework.week2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 78. 子集
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 */
public class Subsets {


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subsets(nums,0,result,new ArrayList<>());
        return result;
    }

    public void subsets(int[] nums,int start,List<List<Integer>> result,List<Integer> list) {
        result.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            subsets(nums,i + 1,result,list);
            list.remove(list.size() - 1);
        }
    }
}
