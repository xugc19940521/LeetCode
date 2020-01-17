package leetcode.question8;


/**
 * @CLassName GuessNumber(374)
 * @Description ����������һ����������Ϸ�� ��Ϸ�������£�
 *              �Ҵ�?1?��?n?ѡ��һ�����֡� ����Ҫ����ѡ�����ĸ����֡�
 *              ÿ����´��ˣ��һ��������������Ǵ��˻���С�ˡ�
 *              �����һ��Ԥ�ȶ���õĽӿ�?guess(int num)�����᷵�� 3 �����ܵĽ����-1��1?�� 0����
 *                -1 : �ҵ����ֱȽ�С
 *                1 : �ҵ����ֱȽϴ�
 *                0 : ��ϲ����¶��ˣ�
 *               ����: n = 10, pick = 6
 *               ���: 6
 * @Version 1.0
 */
public class GuessNumber {


    public static int guessNumber(int n) {
        if(n == 1) return 1;
        int left = 0, right = n;
        while( true ){
            int mid = (right-left)/2 + left;
            int result = guess(mid);
            if(result == 0){
                return mid;
            }else if(result < 0){
                right = mid - 1;
            }else if(result > 0){
                left = mid + 1;
            }
        }
    }

    public static int guess(int s){
        if(s > 6) return -1;
        if(s == 6) return 0;
        if(s < 6) return 1;
        return 0;
    }

}
