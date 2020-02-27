package leetcode.question8;

import java.util.ArrayList;
import java.util.List;

/**
 * @CLassName SelfDividingNumbers(728)
 * @Description �Գ��� ��ָ���Ա���������ÿһλ������������
 *              ���磬128 ��һ���Գ�������Ϊ 128 % 1 == 0��128 % 2 == 0��128 % 8 == 0��
 *              ���У��Գ������������ 0 ��
 *              �����ϱ߽���±߽����֣����һ���б��б��Ԫ���Ǳ߽磨���߽磩�����е��Գ�����
 *              ���룺�ϱ߽�left = 1, �±߽�right = 22
 *              �����[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * @Author xugc
 * @Date 2018/9/30 7:25
 * @Version 1.0
 */
public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            if(selfDividingNumber(i)){
                result.add(i);
            }
        }
        return result;
    }

    public static boolean selfDividingNumber(int num){
        if(num<10)return true;
        int temp = num, c=0;
        while(temp!=0){
            c = temp%10;
            if(c==0||num%c!=0){
                return false;
            }
            temp=temp/10;
        }
        return true;
    }
}
