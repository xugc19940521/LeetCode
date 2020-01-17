package leetcode.question8;

/**
 * @CLassName IsPerfectSquare(367)
 * @Description 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 *              说明：不要使用任何内置的库函数，如  sqrt。
 *               输入: 14
 *               输出: false
 * @Version 1.0
 */
public class IsPerfectSquare {

    public static boolean IsPerfectSquare(int x) {
        if(x<2) return true;
        int left=1 , right=x;
        while(left+1<right){
            int mid = (right-left)/2 + left;
            if(x/mid==mid && x%mid == 0){
                return true;
            }else if(x/mid >= mid){
                left = mid;
            }else{
                right = mid;
            }
        }
        return false;
    }
}
