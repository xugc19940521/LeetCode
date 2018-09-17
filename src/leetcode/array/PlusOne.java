package leetcode.array;

import java.util.ArrayList;

/**
 * @CLassName PlusOne
 * @Description 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *              最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *              你可以假设除了整数 0 之外，这个整数不会以零开头。
 *              示例 1:
 *              输入: [1,2,3]
 *              输出: [1,2,4]
 *              解释: 输入数组表示数字 123。
 * @Author xugc
 * @Date 2018/9/4 7:28
 * @Version 1.0
 */
public class PlusOne {


    public static int[] plusOne(int[] digits) {
        ArrayList<Integer> result = new ArrayList(digits.length);
        for(int i=0;i<digits.length;i++){
            result.add(0);
        }

        int extra = 1;
        for(int i=digits.length-1;i>=0;i--){
            int rightNum = digits[i]+extra;
            if( rightNum >= 10 && i != 0 ){
                result.set(i,rightNum-10);
                extra = 1;
            }else if( rightNum >= 10 && i == 0 ) {
                result.set(i,rightNum-10);
                result.add(0,1);
                extra = 1;
            }else {
                result.set(i,rightNum);
                extra = 0;
            }
        }

        int[] output = new int[result.size()];
        for(int i = 0;i<output.length;i++){
            output[i] = result.get(i);
        }
        return output;
    }
}
