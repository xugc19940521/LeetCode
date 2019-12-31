package leetcode;

import java.util.*;

public class MinimumSwap {

    public static int minimumSwap(String s1, String s2) {
        int[] cnt = new int[2];
        int[] cnt2 = new int[2];
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'x') cnt[0]++;
            else cnt[1]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'x') cnt[0]++;
            else cnt[1]++;
        }

        if (s1.length() != s2.length()) return -1;
        if (cnt[0] % 2 == 1 || cnt[1] % 2 == 1) return -1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) == 'x') cnt2[0]++;
                else cnt2[1]++;
            }
        }
        return (cnt2[0] + 1) / 2 + (cnt2[1] + 1) / 2;
    }


    public static int numberOfSubarrays(int[] nums, int k) {
        int num = 0;
        boolean[] booleans = new boolean[nums.length];
        HashSet<ArrayList> set = new HashSet();
        find(nums, 0, booleans, set);
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            List list = (List) itr.next();
            if(list.size() == nums.length){
                continue;
            }
            if(getNumOfOdds(list) ==k ){
                num += 1;
            }
        }
        return num;
    }

    public static int  getNumOfOdds(List<Integer> arr){
        int nums = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)%2 != 0){
                nums += 1;
            }
        }
        return nums;
    }

    static void find(int[] arr, int position, boolean[] isIns, HashSet set) {
        if (position == arr.length) {
            List<Integer> list = new LinkedList();
            for (int i = 0; i < arr.length;i++) {
                if (isIns[i]) {
                    list.add(arr[i]);
                }
            }
            set.add(list);
        } else {
            isIns[position] = true;
            find(arr, position + 1, isIns,set);
            isIns[position] = false;
            find(arr, position + 1, isIns,set);
        }
    }

    public static String minRemoveToMakeValid(String s) {
        ArrayList<Integer> removeIndexList = new ArrayList();
        Deque<Map> stack = new ArrayDeque();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            Map m = new HashMap();
            m.put("value", c);
            m.put("index", i);
            if(c == ')'){
                if(stack.isEmpty()){
                    removeIndexList.add(i);
                    continue;
                }
                Map lastMap = stack.getLast();
                if((Character) lastMap.get("value") != '('){
                    removeIndexList.add(i);
                }
                stack.pop();
            }else if(c == '('){
                stack.push(m);
            }
        }
        while(!stack.isEmpty()){
            Map lastMap = stack.pop();
            removeIndexList.add((Integer)lastMap.get("index"));
        }
        StringBuffer sbf = new StringBuffer();
        for(int i=0; i<s.length();i++){
           if(!removeIndexList.contains(i)){
               sbf.append(s.charAt(i));
           }
        }
        return sbf.toString();
    }

}
