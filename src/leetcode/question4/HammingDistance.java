package leetcode.question4;

/**
 * @CLassName HammingDistance(461)
 * @Description ��������֮��ĺ�������ָ�������������ֶ�Ӧ������λ��ͬ��λ�õ���Ŀ��
 *              ���룺x = 1, y = 4
 *              �����2
 * @Author xugc
 * @Date 2020/2/27
 * @Version 1.0
 */
public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        int count = 0;
        int t = x^y;
        while(t!=0){
            t = t & (t-1);
            count++;
        }
        return count;
    }
}
