//给出一个区间的集合，请合并所有重叠的区间。
//
// 示例 1:
//
// 输入: [[1,3],[2,6],[8,10],[15,18]]
//输出: [[1,6],[8,10],[15,18]]
//解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
//
//
// 示例 2:
//
// 输入: [[1,4],[4,5]]
//输出: [[1,5]]
//解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
// Related Topics 排序 数组
// 👍 530 👎 0


package com.shuzijun.leetcode.editor.en;

public class MergeIntervals {
    public static void main(String[] args) {
        Solution solution = new MergeIntervals().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] merge(int[][] intervals) {
            int len = intervals.length;
            if (len < 2) {
                return intervals;
            }

            // 按照起点排序
            Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

            // 也可以使用 Stack，因为我们只关心结果集的最后一个区间
            List<int[]> res = new ArrayList<>();
            res.add(intervals[0]);

            for (int i = 1; i < len; i++) {
                int[] curInterval = intervals[i];

                // 每次新遍历到的列表与当前结果集中的最后一个区间的末尾端点进行比较
                int[] peek = res.get(res.size() - 1);

                if (curInterval[0] > peek[1]) {
                    res.add(curInterval);
                } else {
                    // 注意，这里应该取最大
                    peek[1] = Math.max(curInterval[1], peek[1]);
                }
            }
            return res.toArray(new int[res.size()][]);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
