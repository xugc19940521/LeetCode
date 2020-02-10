package leetcode.question11;

import java.util.HashMap;
import java.util.List;

/**
 * @CLassName CommonChars(1002)
 * @Description 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。
 *              例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 *              你可以按任意顺序返回答案
 *              输入：["bella","label","roller"]
 *              输出：["e","l","l"]
 * @Author xugc
 * @Date 2019/5/31
 * @Version 1.0
 */
public class CommonChars {


    public List<String> commonChars(String[] A) {

        HashMap numOfChars = new HashMap();
        for(int i=0;i<A.length;i++){

            char[] aTempStr = A[i].toCharArray();
            for(int j=0;j<aTempStr.length;j++){

            }
        }

        return null;
    }
}
