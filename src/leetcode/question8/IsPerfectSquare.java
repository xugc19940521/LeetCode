package leetcode.question8;

/**
 * @CLassName IsPerfectSquare(367)
 * @Description ����һ�������� num����дһ����������� num ��һ����ȫƽ�������򷵻� True�����򷵻� False��
 *              ˵������Ҫʹ���κ����õĿ⺯������  sqrt��
 *               ����: 14
 *               ���: false
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
