package leetcode.question19;


import java.util.HashSet;

/**
 * @CLassName NumUniqueEmails(929)
 * @Description ÿ������ʼ�����һ���������ƺ�һ��������ɣ��� @ ���ŷָ���
 *              ���磬�� alice@leetcode.com�У� alice �Ǳ������ƣ��� leetcode.com ��������
 *              ����Сд��ĸ����Щ�����ʼ������ܰ��� ',' �� '+'��
 *              ����ڵ����ʼ���ַ�ı������Ʋ����е�ĳЩ�ַ�֮����Ӿ�㣨'.'��������������ʼ�����ת��������������û�е��ͬһ��ַ�����磬"alice.z@leetcode.com�� �� ��alicez@leetcode.com�� ��ת����ͬһ�����ʼ���ַ�� ����ע�⣬�˹�����������������
 *              ����ڱ�����������ӼӺţ�'+'���������Ե�һ���Ӻź�����������ݡ����������ĳЩ�����ʼ������� m.y+name@email.com ��ת���� my@email.com�� ��ͬ�����˹�����������������
 *              ����ͬʱʹ������������
 *              ���������ʼ��б� emails�����ǻ����б��е�ÿ����ַ����һ������ʼ���ʵ���յ��ʼ��Ĳ�ͬ��ַ�ж��٣�
 *
 *              ���룺["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
 *              �����2
 *
 *              ��ʾ��
 *                  1 <= emails[i].length <= 100
 *                  1 <= emails.length <= 100
 *                  ÿ�� emails[i] ���������ҽ���һ�� '@' �ַ���
 * @Author xugc
 * @Date 2019/2/22
 * @Version 1.0
 */
public class NumUniqueEmails {

    public static int NumUniqueEmails(String[] emails) {
        //set����Ԫ�ز����ظ���������������email

        HashSet set = new HashSet();
        for(int i=0;i<emails.length;i++){

            String[] splitStrs = emails[i].split("@");

            String prefix = splitStrs[0];
            String suffix = splitStrs[1];

            String finalStr ;
            int index = prefix.indexOf("+");
            if(index>0){
                finalStr = prefix.substring(0,index).replaceAll("\\.","") + "@" + suffix;
            }else{
                finalStr = prefix.replaceAll("\\.","") + "@" + suffix;
            }
            set.add(finalStr);
        }
        return set.size();
    }
}
