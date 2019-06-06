package leetcode.question20;

/**
 * @CLassName NumRookCaptures(999)
 * @Description  ��һ�� 8 x 8 �������ϣ���һ����ɫ����rook����Ҳ�����пշ��飬��ɫ����bishop���ͺ�ɫ���䣨pawn����
 *               ���Ƿֱ����ַ� ��R������.������B�� �� ��p�� ��������д�ַ���ʾ���壬Сд�ַ���ʾ���塣
 *               �������������еĹ����ƶ�����ѡ���ĸ����������е�һ�����������������ϣ���Ȼ���Ǹ������ƶ���
 *               ֱ����ѡ��ֹͣ���������̵ı�Ե���ƶ���ͬһ����������÷�������ɫ�෴���䡣
 *               ���⣬�������������ѷ�����ɫ�������ͬһ������
 *               ���س��ܹ���һ���ƶ��в��񵽵����������
 *               ���룺 [[".",".",".",".",".",".",".","."],
 *                      [".",".",".","p",".",".",".","."],
 *                      [".",".",".","R",".",".",".","p"],
 *                      [".",".",".",".",".",".",".","."],
 *                      [".",".",".",".",".",".",".","."],
 *                      [".",".",".","p",".",".",".","."],
 *                      [".",".",".",".",".",".",".","."],
 *                      [".",".",".",".",".",".",".","."]]
 *               �����3
 * ���ͣ�
 * @Author xugc
 * @Date 2019/4/30 13:25
 * @Version 1.0
 */
public class NumRookCaptures {

    public static int numRookCaptures(char[][] board){
        int num = 0;
        //֪��R��λ��
        int x=0, y=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j] == 'R'){
                    x = i;
                    y = j;
                }
            }
        }
        //����x=7��y=7
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
