package leetcode.question1;

/**
 * @CLassName IsPalindrome(9)
 * @Description �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
 *              ���룺121
 *              �����true
 * @Author xugc
 * @Date 2019/4/23 22:05
 * @Version 1.0
 */
public class IsPalindrome {
    public static boolean isPalindrome(int x) {

        String sb = String.valueOf(x);
        for(int i=0, j=sb.length()-1;i<j;i++,j--){
            if((sb.charAt(i)) != (sb.charAt(j))){
                return false;
            }
        }
        return true;
    }
}
