package leetcode.question9;


/**
 * @CLassName CountSegments(434)
 * @Description 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 *              请注意，你可以假定字符串里不包括任何不可打印的字符。
 *              输入："Hello, my name is John"
 *              输出： 5
 * @Version 1.0
 */
public class CountSegments {

    public static int countSegments(String s) {
        return (s == null || s.trim().length() == 0) ? 0 : s.trim().split("\\s+").length;
    }
}
