package leetcode.question11;

/**
 * @CLassName DetectCapitalUse(520)
 * @Description ����һ�����ʣ�����Ҫ�жϵ��ʵĴ�дʹ���Ƿ���ȷ��
 *              ���Ƕ��壬���������ʱ�����ʵĴ�д�÷�����ȷ�ģ�
 *                  ȫ����ĸ���Ǵ�д������"USA"��
 *                  ������������ĸ�����Ǵ�д������"leetcode"��
 *                  ������ʲ�ֻ����һ����ĸ��ֻ������ĸ��д�� ���� "Google"��
 *              �������Ƕ����������û����ȷʹ�ô�д��ĸ
 * @Version 1.0
 */
public class DetectCapitalUse {

    public static boolean detectCapitalUse(String word) {
        int len = word.length();
        char first = word.charAt(0);
        char second = word.charAt(1);
        for(int i=1;i<len;i++){
            char c = word.charAt(i);
            if('Z'-first>= 0){
                if('Z'-second>=0){
                    if('Z'-c>=0){
                        continue;
                    }else{
                        return false;
                    }
                }else{
                    if('Z'-c>=0){
                        return false;
                    }else{
                        continue;
                    }
                }
            }else{
                if('Z'-second>=0){
                    return false;
                }else{
                    if('Z'-c>=0){
                        return false;
                    }else{
                        continue;
                    }
                }
            }
        }
        return true;
    }
}
