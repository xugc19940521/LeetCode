package leetcode.question7;

/**
 * @CLassName IsPowerOfThree(326)
 * @Description 给定一个整数，编写一个函数来判断它是否是 3 的幂次方。

 * @Version 1.0
 */
public class IsPowerOfThree {
    public static boolean IsPowerOfThree(int n) {
        if(n==0) return false;
        if(n==1) return true;
        while(n!=1){
            if(n%3 ==0){
                n=n/3;
            }else{
                return false;
            }
        }
        return true;
    }
}
