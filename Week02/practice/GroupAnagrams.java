//给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
//
// 示例:
//
// 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//]
//
// 说明：
//
//
// 所有输入均为小写字母。
// 不考虑答案输出的顺序。
//
// Related Topics 哈希表 字符串


package com.shuzijun.leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class GroupAnagrams {
    public static void main(String[] args) {
        Solution solution = new GroupAnagrams().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            if (strs == null || strs.length == 0) {
                return new ArrayList<>();
            }
            Map<String, List<String>> resultMap = new HashMap<>();
            for (String str : strs) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String sortedStr = String.valueOf(chars);
                if (resultMap.containsKey(sortedStr)) {
                    resultMap.get(sortedStr).add(str);
                } else {
                    List<String> mapList = new ArrayList<String>();
                    mapList.add(str);
                    resultMap.put(sortedStr, mapList);
                }
            }
            return new ArrayList<List<String>>(resultMap.values());
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
