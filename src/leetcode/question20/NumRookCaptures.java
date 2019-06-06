package leetcode.question20;

/**
 * @CLassName NumRookCaptures(999)
 * @Description  在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。
 *               它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。
 *               车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，
 *               直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。
 *               另外，车不能与其他友方（白色）象进入同一个方格。
 *               返回车能够在一次移动中捕获到的卒的数量。
 *               输入： [[".",".",".",".",".",".",".","."],
 *                      [".",".",".","p",".",".",".","."],
 *                      [".",".",".","R",".",".",".","p"],
 *                      [".",".",".",".",".",".",".","."],
 *                      [".",".",".",".",".",".",".","."],
 *                      [".",".",".","p",".",".",".","."],
 *                      [".",".",".",".",".",".",".","."],
 *                      [".",".",".",".",".",".",".","."]]
 *               输出：3
 * 解释：
 * @Author xugc
 * @Date 2019/4/30 13:25
 * @Version 1.0
 */
public class NumRookCaptures {

    public static int numRookCaptures(char[][] board){
        int num = 0;
        //知道R的位置
        int x=0, y=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j] == 'R'){
                    x = i;
                    y = j;
                }
            }
        }
        //假如x=7，y=7
        for(int i=x+1;i<8;i++){
            if(board[i][y] == 'B'){
                break;
            }else if(board[i][y] == 'p'){
                num++;
                break;
            }
        }

        for(int i=x-1;i>=0;i--){
            if(board[i][y] == 'B'){
                break;
            }else if(board[i][y] == 'p'){
                num++;
                break;
            }
        }

        for(int i=y+1;i<8;i++){
            if(board[x][i] == 'B'){
                break;
            }else if(board[x][i] == 'p'){
                num++;
                break;
            }
        }

        for(int i=y-1;i>=0;i--){
            if(board[x][i] == 'B'){
                break;
            }else if(board[x][i] == 'p'){
                num++;
                break;
            }
        }

        return num;

    }
}
