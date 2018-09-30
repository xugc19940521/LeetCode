package leetcode.question14;

/**
 * @CLassName JudgeCircle(657)
 * @Description �ڶ�άƽ���ϣ���һ�������˴�ԭ�� (0, 0) ��ʼ�����������ƶ�˳���ж����������������ƶ����Ƿ��� (0, 0) ��������
 *              �ƶ�˳�����ַ�����ʾ���ַ� move[i] ��ʾ��� i ���ƶ��������˵���Ч������ R���ң���L���󣩣�U���ϣ��� D���£��������������������ж����󷵻�ԭ�㣬�򷵻� true�����򣬷��� false��
 *              ע�⣺�����ˡ��泯���ķ����޹ؽ�Ҫ�� ��R�� ��ʼ��ʹ�����������ƶ�һ�Σ���L�� ��ʼ�������ƶ��ȡ����⣬����ÿ���ƶ������˵��ƶ�������ͬ��
 *              ���룺"UD"
 *              �����true
 * @Author xugc
 * @Date 2018/9/30
 * @Version 1.0
 */
public class JudgeCircle {

    public static boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();
        if(chars.length%2!=0)return false;
        int rNum = 0, lNum = 0, uNum = 0, dNum = 0;
        for(int i=0;i<chars.length;i++){
            switch(chars[i]){
                case 'R':
                    rNum+=1;
                    break;
                case 'L':
                    lNum+=1;
                    break;
                case 'U':
                    uNum+=1;
                    break;
                case 'D':
                    dNum+=1;
                    break;
            }
        }
        if(rNum == lNum && uNum == dNum){
            return true;
        }
        return false;
    }
}
