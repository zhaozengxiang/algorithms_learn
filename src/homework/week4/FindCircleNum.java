package homework.week4;

import homework.common.UnionFind;

/**
 * 547. 省份数量
 */
public class FindCircleNum {

    public static void main(String[] args) {

    }
    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    unionFind.union(i, j);
                }
            }
        }
        return unionFind.getCount();
    }
}
