
package logic;


/*
 * @author VAVIRO

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
                checkAround(i, j);                                
            }
        }
        return flag;
    }
    
    public boolean checkAround(int i, int j){        
        if (this.checkNorthwest(i, j)) {
            return true;
        }
        if (this.checkNorth(i, j)) {
            return true;
        }
        if (this.checkNorthEast(i, j)) {
            return true;
        }
        if (this.checkWest(i, j)) {
            return true;
        }
        if (this.checkThis(i, j)) {
            return true;
        }
        if (this.checkSouthWest(i, j)) {
            return true;
        }        
        if (this.checkSouth(i, j)) {
            return true;
        }
        if (this.checkSouthEast(i, j)) {
            return true;
        }
        return false;
    }
    
    public boolean checkNorthwest(int i, int j){
        if (board[i-1][j-1] == 1) {
            return true;
        }
        return false;
    }    
    
    public boolean checkNorth(int i, int j){
        if (board[i-1][j-1] == 1) {
            return true;
        }
        return false;
    }    
    
    public boolean checkNorthEast(int i, int j){
        if (board[i-1][j-1] == 1) {
            return true;
        }
        return false;
    }    
    
    public boolean checkWest(int i, int j){
        if (board[i-1][j-1] == 1) {
            return true;
        }
        return false;
    }    
    
    public boolean checkThis(int i, int j){
        if (board[i-1][j-1] == 1) {
            return true;
        }
        return false;
    }    
    
    public boolean checkSouthWest(int i, int j){
        if (board[i-1][j-1] == 1) {
            return true;
        }
        return false;
    }    
    
    public boolean checkSouth(int i, int j){
        if (board[i-1][j-1] == 1) {
            return true;
        }
        return false;
    }    
    
    public boolean checkSouthEast(int i, int j){
        if (board[i-1][j-1] == 1) {
            return true;
        }
        return false;
    }    
    
    
}
