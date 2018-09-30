package leetcode.question6;
/**
 * @CLassName CanWinNim(292)
 * @Description     ���������ѣ�������һ���� Nim��Ϸ����������һ��ʯͷ��ÿ�����������õ� 1 - 3 ��ʯͷ��
 *                  �õ����һ��ʯͷ���˾��ǻ�ʤ�ߡ�����Ϊ���֡�
 *                  �����Ǵ����ˣ�ÿһ���������Ž⡣ ��дһ�����������ж����Ƿ�����ڸ���ʯͷ�����������Ӯ����Ϸ��
 *                  ���룺4
 *                  �����false
 * @Author xugc
 * @Date 2018/9/30
 * @Version 1.0
 */
public class CanWinNim {

    //����f[t]=1��ʾt��ʯͷ��ʱ�����ֻ�Ӯ��f[t]=0��ʾt��ʯͷ��ʱ�����
    public static boolean canWinNim(int n){

        int stones = n;
        int[] f = new int[stones+1] ;
        int[] k = {1,2,3};

        f[1] = 1;//1��ʯͷ��ʱ�����ֻ�Ӯ
        for(int i=2;i<=stones;i++){
            f[i] = 0;
            for(int j=0;j<k.length;j++){
                //���õ�k[j]��ʯͷʱ��ʣ��i-k[j]��ʯͷ�������ʱ f[i-k[j]]���ֻ���Ļ���f[i]��Ӯ
                if(f[i-k[j]]==0){
                    f[i] = 1;
                    break;
                }
            }
        }
        return f[stones]==1;
    }

    //ֻҪ��4�ı�����һ���䣬����һ��Ӯ
    public static boolean canWinNim2(int n){
        return n%4!=0;
    }
}
