package leetcode.question3;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int[] a = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            a[nums[i]] = nums[i];
        }

        for(int i=1;i<a.length;i++){
            if(a[i] == 0){
                return i;
            }
        }
        return 0;
    }
}
