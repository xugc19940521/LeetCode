package leetcode.question11;

/**
 * @CLassName DetectCapitalUse(520)
 * @Description 给定一个单词，你需要判断单词的大写使用是否正确。
 *              我们定义，在以下情况时，单词的大写用法是正确的：
 *                  全部字母都是大写，比如"USA"。
 *                  单词中所有字母都不是大写，比如"leetcode"。
 *                  如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 *              否则，我们定义这个单词没有正确使用大写字母
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
