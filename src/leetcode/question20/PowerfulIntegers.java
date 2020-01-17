package leetcode.question20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @CLassName PowerfulIntegers(970)
 * @Description �������������� x �� y�����ĳһ�������� x^i + y^j���������� i >= 0 �� j >= 0����ô������Ϊ��������һ��ǿ������
 *              ����ֵС�ڻ���� bound ������ǿ������ɵ��б�
 *              ����԰��κ�˳�򷵻ش𰸡�����Ļش��У�ÿ��ֵ������һ�Ρ�

 *              ���룺 x = 2, y = 3, bound = 10
 *              ����� [2,3,4,5,7,9,10]
 * @Version 1.0
 */
public class PowerfulIntegers {

    public static List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set s = new HashSet<>();

        int divisor = 1;
        for(int i=bound;i>=2;i--){
            while(divisor<=bound){
                int extra = bound - divisor;


                divisor = divisor*x;
            }

        }
        return new ArrayList<>(s);
    }
}
