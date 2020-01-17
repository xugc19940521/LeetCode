package leetcode.question2;

import java.util.*;

/**
 * @CLassName Subsets(90)
 * @Description 给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *              输入：nums = [1,2,2]
 *              输出：[  [2],[1],[1,2,2],[2,2],[1,2],[] ]
 * @Version 1.0
 */
public class SubsetsWithDup {

    public static List<List<Integer>> SubsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<ArrayList> s = new HashSet<>();
        s.add(new ArrayList());
        for (int i = 0; i < nums.length; i++) {
            Iterator itr = s.iterator();
            HashSet bSet = new HashSet();
            while (itr.hasNext()) {
                ArrayList a = (ArrayList) (itr.next());
                ArrayList b = (ArrayList) a.clone();
                b.add(nums[i]);
                bSet.add(b);
            }
            s.addAll(bSet);
        }
        return new ArrayList(s);
    }
}
