package leetcode.array;

/**
 * <p>标题: MoveZeroes</p>
 * <p/>
 * <p>描述: ${DESCRIPTION}</p>
 * <p/>
 * ${DETAIL}
 * <p/>
 * <p>版权: 税友软件集团股份有限公司</p>
 * <p/>
 * <p>创建时间: 2018-09-17</p>
 * <p/>
 * <p>作者：xugc</p>
 */

public class MoveZeroes {

    public static void moveZeroes(int[] nums){
        if(nums.length<2)return;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]==0){
                for(int j=i+1;j<nums.length;j++){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j] ;
                    nums[j] = temp;
                }
            }
        }
    }
}
