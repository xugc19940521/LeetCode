package leetcode.question2;
/**
 *@CLassName LengthOfLastWord(58)
 * ����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��������������һ�����ʵĳ��ȡ�
 *
 * ������������һ�����ʣ��뷵�� 0 ��
 *
 * ˵����һ��������ָ����ĸ��ɣ����������κοո���ַ�����
 * */
public class LengthOfLastWord {


    public static int lengthOfLastWord(String s){
        int len = s.length();
        int result = 0;
        for(int i=len-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                result ++;
            }else{
                if(result!=0){
                    break;
                }
            }
        }
        return result;

    }
}
