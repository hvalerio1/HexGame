
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
    
    public boolean checkRowsRed(){   
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
    
    public boolean checkColsBlue(){   
        boolean flag = false;
        for (int i = 1; i < board.length-1; i++) {
            for (int j = 1; j < board[0].length-1; j++) {
                if (board[j][i] == 1) {
                    flag = true;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkWinnerRed(){
        boolean flag = false;
        int [] aux = new int [size];
        int [] aux1 = new int [size];
        int aux2 = 0;
        if (this.checkRowsRed()) {
            for (int i = 1; i < board.length - 1; i++) {
                for (int j = 1; j < board[0].length - 1; j++) {
                    if (board[i][j] == 1) { //search for a selected cel 
                        if (aux == null) {
                            aux = new int [size];
                            aux[j] = board[i][j];
                        }            
                        else{
                            checkConnection(aux, i, j);
                        }                                                    
                    }                    
                }
            }
            return true;
        }
        else{
            return false;
        }        
    }
    
    public boolean checkConnection(int [] aux, int i, int j){
        boolean flag = false;
        for (int k = 0; k < aux.length; k++) {
            if (aux[k] == 1) {
                
            }
        }
        return flag;
    }
    /*Posiciones vecinas de la primera fila 
        (0,0) => (i, j+1), (i+1, j)
        (0,?) => (i, j-1),(i, j+1),(i+1),(i+1, j)
        (0,size) => (i, j-1),(i+1, j-1),(i+1, j)
    */  
    /*Posiciones vecinas de la siguiente fila
        (1,0) => (i-1, j), (i-1, j+1), (i, j+1), (i+1, j)
        (1,?) => (i-1, j), (i-1, j+1), (i, j-1), (i, j+1), (1+1, j-1), (i+1, j)
        (1,size) => (i-1, j), (i-1, j+1), (i, j+1), (i+1, j)  
    */
    /*Posiciones de la ultima fila
        (size, 0) => (i-1, j), (i-1, j+1), (i, j+1)
        (size, ?) => (i-1, j), (i-1, j+1), (i, j-1), (i, j+1) 
        (size, size) => (i-1, j), (i, j-1)
    */
    //Posiciones no vecinas (i-1 j-1), (i+1 j+1)
}
