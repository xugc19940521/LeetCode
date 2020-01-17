package leetcode.question1;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @CLassName GenerateParenthesis(22)
 * @Description 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *              例如，给出 n = 3，生成结果为：
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
