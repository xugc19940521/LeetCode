package leetcode.question20;

import java.util.HashSet;

/**
 * @CLassName RepeatedNTimes(961)
 * @Description �ڴ�СΪ 2N ������ A ���� N+1 ����ͬ��Ԫ�أ�������һ��Ԫ���ظ��� N �Ρ�
 *              �����ظ��� N �ε��Ǹ�Ԫ�ء�
 * @Author xugc
 * @Date 2019/2/25
 * @Version 1.0
 */
public class RepeatedNTimes {

    public static int repeatedNTimes(int[] A) {
        HashSet set = new HashSet();
        for(int a : A){
            if(set.contains(a)){
                return a;
            }else{
                set.add(a);
            }
        }
        return 0;
    }
}
