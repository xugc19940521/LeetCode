package leetcode.question21;

/**
 * @CLassName NumPairsDivisibleBy60(1010)
 * @Description �ڸ����б��У��� i �׸����ĳ���ʱ��Ϊ time[i] �롣
 *              �������ܳ���ʱ�䣨����Ϊ��λ���ɱ� 60 �����ĸ����Ե���������ʽ�ϣ�����ϣ������������??i < j ����?(time[i] + time[j]) % 60 == 0��
 *              ���룺arr = [30,20,150,100,40]
 *              �����3
 * @Version 1.0
 */
public class NumPairsDivisibleBy60 {
    public static int numPairsDivisibleBy60(int[] time) {
        int result = 0;
        for(int i=0;i<time.length;i++){
            for(int j=i+1;j<time.length;j++){
                if((time[i]+time[j])%60==0){
                    result++;
                }
            }
        }
        return result;
    }

    public static int numPairsDivisibleBy602(int[] time) {
        int result = 0;
        int[] nums = new int[60];
        for(int t : time){
            nums[t%60]++;
        }
        for(int i=1;i<30;i++){
            result += nums[i]*nums[60-i];
        }
        result += nums[0]*(nums[0]-1)/2 + nums[30]*(nums[30]-1)/2;
        return result;
    }
}
