package leetcode.question5;

import java.util.Arrays;

public class FindContentChildren {

    public static int findContentChildren(int[] g, int[] s) {
        return method2(g,s);
    }

    public static int method1(int[] g, int[] s){
        int num = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(g[i] <= s[j]){
                    s[j] = 0;
                    num++;
                    break;
                }
            }
        }
        return num;
    }

    public static int method2(int[] g, int[] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0;
        int cookie=0;
        while(child<g.length && cookie<s.length)
        {
            if(g[child]<=s[cookie])
            {
                child++;
            }
            cookie++;
        }
        return child;
    }
}
