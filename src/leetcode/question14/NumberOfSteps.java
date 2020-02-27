package leetcode.question14;

/**
 * @CLassName NumberOfSteps(1342)
 * @Description ����һ���Ǹ����� num �����㷵�ؽ������ 0 ����Ҫ�Ĳ����� �����ǰ������ż��������Ҫ�������� 2 �����򣬼�ȥ 1 ��
 *              ���룺14
 *              �����6
 * @Author xugc
 * @Date 2020/2/27
 * @Version 1.0
 */
public class NumberOfSteps {
    public static int numberOfSteps (int num) {
        int step = 0;
        while(num!=0){
            if(num%2!=0){
                num--;
            }else{
                num = num/2;
            }
            step++;
        }
        return step;
    }
}
