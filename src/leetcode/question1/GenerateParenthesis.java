package leetcode.question1;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @CLassName GenerateParenthesis(22)
 * @Description ���� n �����������ŵĶ���������д��һ��������ʹ���ܹ��������п��ܵĲ�����Ч��������ϡ�
 *              ���磬���� n = 3�����ɽ��Ϊ��
 *             ["((()))","(()())","(())()","()(())","()()()"]
 * @Version 1.0
 */
public class GenerateParenthesis {

    public static List<String> generateParenthesis(int n) {
        int left=1 , right=0;
        HashSet<String> set = new HashSet();
        set.add("(");
        while(left<=n && right<=n){
            if(left>right){
                for(String s : set){

                }
            }else{

            }

        }

        return null;
    }
}
