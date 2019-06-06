package leetcode.question20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @CLassName AddToArrayForm(989)
 * @Description ���ڷǸ����� X ���ԣ�X ��������ʽ��ÿλ���ְ������ҵ�˳���γɵ����顣���磬��� X = 1231����ô��������ʽΪ [1,2,3,1]��
 *              �����Ǹ����� X ��������ʽ A���������� X+K ��������ʽ��
 *              ���룺A = [1,2,0,0], K = 34
 *              �����[1,2,3,4]
 *              ���ͣ�1200 + 34 = 1234
 * @Author xugc
 * @Date 2019/2/25
 * @Version 1.0
 */
public class AddToArrayForm {

    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ans = new ArrayList();
        int flag = 0;
        int len = A.length-1;

        while(len>=0 || K>0){
            int extraNumber = K%10;
            int aNumber = len>=0?A[len]:0;
            int temp = aNumber + extraNumber + flag;
            if(temp>=10){
                flag = 1;
                ans.add(temp - 10);
            }else{
                flag = 0;
                ans.add(temp);
            }
            K=K/10;
            len--;
        }
        if(flag==1){
            ans.add(1);
        }
        Collections.reverse(ans);
        return ans;
    }
}
