package homework.week2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 47. 全排列 II
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 */
public class PermuteUnique {

    Map<Integer,Integer> map = new HashMap<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            map.put(i,nums[i]);
        }
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        permuteUnique(nums,result,list);
        return new ArrayList<>(result);
    }

    public void permuteUnique(int[] nums,Set<List<Integer>> result, List<Integer> list) {
        if (list.size() == nums.length) {
            result.add(list.stream().map(a -> map.get(a)).collect(Collectors.toList()));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(i)) {
                continue;
            }
            list.add(i);
            permuteUnique(nums,result,list);
            list.remove(list.size() - 1);
        }
    }
}
