package leetcode.question1;

/**
 * @CLassName MySqrt(69)
 * @Description 实现 int sqrt(int x) 函数
 *              计算并返回 x 的平方根，其中 x 是非负整数。
 *              由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *               输入: 8
 *               输出: 2
 * @Version 1.0
 */
public class MySqrt {

    public static int mySqrt(int x) {
        if(x<2) return x;
        int left=1 , right=x;
        while(left+1<right){
            int mid = (right-left)/2 + left;
            if(x/mid==mid && x%mid == 0){
                return mid;
            }else if(x/mid >= mid){
                left = mid;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
