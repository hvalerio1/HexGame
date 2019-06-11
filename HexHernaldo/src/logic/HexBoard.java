
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
        this.board = new int[size][size];
    }
       
    public static void addHexFile(HexButton button){
        int a = button.getA();
        int b = button.getB();
        board[a][b] = 1;        
        node_counter++;        
    }
    
    public boolean checkWinner(){   
        boolean flag = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    flag = true;
                }
            }
            if (flag) {
                
            }
        }
        return true;
    }
}
