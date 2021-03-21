package homework.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. 组合
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 */
public class Combine {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combine(n,k,1,result,list);
        return result;

    }

    public void combine(int n, int k, int j, List<List<Integer>> result, List<Integer> list) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = j; i <= n; i++) {
            list.add(i);
            combine(n,k,i + 1,result,list);
            list.remove(list.size() - 1);
        }
    }
}
