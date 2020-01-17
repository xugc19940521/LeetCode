package leetcode.question2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @CLassName Subsets(78)
 * @Description ����һ�鲻���ظ�Ԫ�ص��������� nums�����ظ��������п��ܵ��Ӽ����ݼ�����
 *              ���룺nums = [1,2,3]
 *              �����[ [3],[1],[2],[1,2,3],[1,3],[2,3],[1,2],[] ]
 * @Version 1.0
 */
public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        HashSet<ArrayList> s = new HashSet<>();
        s.add(new ArrayList());

        for(int i=0;i<nums.length;i++){
            Iterator itr = s.iterator();
            HashSet bSet = new HashSet();
            while(itr.hasNext()){
                ArrayList a = (ArrayList) (itr.next());
                ArrayList b = (ArrayList)a.clone();
                b.add(nums[i]);
                bSet.add(b);
            }
            s.addAll(bSet);
        }
        return new ArrayList(s);
    }
}
