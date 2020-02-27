package leetcode.question1;

/**
 * @CLassName MySqrt(69)
 * @Description ʵ�� int sqrt(int x) ����
 *              ���㲢���� x ��ƽ���������� x �ǷǸ�������
 *              ���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��
 *               ����: 8
 *               ���: 2
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
