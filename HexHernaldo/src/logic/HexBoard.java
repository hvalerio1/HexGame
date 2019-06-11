
package logic;


/*
 * @author Estudiante
 */
public class HexBoard {

    private int size;    
    private static int node_counter;
    private static int [][] board;    

    public HexBoard(int size) {
        this.size = size;
        this.node_counter = 1;        
        this.board = new int[size+2][size+2];
    }
       
    public static void addHexFile(HexButton button){
        int a = button.getA();
        int b = button.getB();
        board[a][b] = 1;        
        node_counter++;        
    }
    
    public boolean checkWinner(){   
        boolean flag = false;
        for (int i = 1; i < board.length-1; i++) {
            for (int j = 1; j < board[0].length-1; j++) {
                if (board[i][j] == 1) {
                    flag = true;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }
}
