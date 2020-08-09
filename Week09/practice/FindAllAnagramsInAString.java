//给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
//
// 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
//
// 说明：
//
//
// 字母异位词指字母相同，但排列不同的字符串。
// 不考虑答案输出的顺序。
//
//
// 示例 1:
//
//
//输入:
//s: "cbaebabacd" p: "abc"
//
//输出:
//[0, 6]
//
//解释:
//起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
//起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
//
//
// 示例 2:
//
//
//输入:
//s: "abab" p: "ab"
//
//输出:
//[0, 1, 2]
//
//解释:
//起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
//起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
//起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。
//
// Related Topics 哈希表
// 👍 337 👎 0


package com.shuzijun.leetcode.editor.en;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        Solution solution = new FindAllAnagramsInAString().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            char[] arrS = s.toCharArray();
            char[] arrP = p.toCharArray();

            List<Integer> ans = new ArrayList<>();

            int[] needs = new int[26];
            int[] window = new int[26];

            for (int i = 0; i < arrP.length; i++) {
                needs[arrP[i] - 'a'] += 1;
            }

            int left = 0;
            int right = 0;

            while (right < arrS.length) {
                int curR = arrS[right] - 'a';
                right++;
                window[curR] += 1;

                while (window[curR] > needs[curR]) {
                    int curL = arrS[left] - 'a';
                    left++;
                    window[curL] -= 1;
                }

                if (right - left == arrP.length) {
                    ans.add(left);
                }
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
