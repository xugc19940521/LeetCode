package leetcode.question5;

/**
 * @CLassName IsPowerOfTwo(231)
 * @Description ����һ����������дһ���������ж����Ƿ��� 2 ���ݴη���

 * @Version 1.0
 */
public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        if(n==1) return true;
        while(n!=1){
            if(n%2 ==0){
                n=n/2;
            }else{
                return false;
            }
        }
        return true;
    }

}
