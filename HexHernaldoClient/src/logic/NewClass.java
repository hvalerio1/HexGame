/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author mi pc
 */
public class NewClass {
    private int size;    
    private static int node_counter;
    private static HexNode [][] board;    
    private int levels = 0;

    public NewClass(int size) {
        this.size = size;
        this.node_counter = 1;        
        this.board = new HexNode[size+2][size+2];
    }
    
    public boolean checkRowsRed(){   
        boolean flag = false;
        for (int i = 1; i < board.length-1; i++) {
            for (int j = 1; j < board[0].length-1; j++) {
                if (board[i][j] != null) {
                    flag = true;
                }
            }            
            if (!flag) {
                return false;
            }
            flag = false;            
        }
    return false;
    }
    
    public boolean checkColsBlue(){   
        boolean flag = false;
        for (int i = 1; i < board.length-1; i++) {
            for (int j = 1; j < board[0].length-1; j++) {
                if (board[j][i] != null) {
                    flag = true;
                }
            }
            if (!flag) {
                return false;
            }
            flag = false;
        }
        return true;
    }
    
    public boolean checkWinnerRed(HexNode node){
        
        if (levels == size) {
            return true;
        }
        
        if (node.getDown_left() != null && node.getDown_left().isActive()) {
            levels++;            
            node.getUp_right().setActive(false);                        
            checkWinnerRed(node.getDown_left());
        }
        if (node.getDown_right() != null) {
            levels++;
            node.getUp_left().setActive(false);            
            checkWinnerRed(node.getDown_right());
        }        
        
        if (node.getUp_left() != null) {
            levels--;
            node.getDown_right().setActive(false);            
            checkWinnerRed(node.getUp_left());
        }
        if (node.getUp_right() != null) {
            levels--;
            node.getDown_left().setActive(false);            
            checkWinnerRed(node.getUp_right());
        }
        if (node.getLeft() != null) {
            node.getRight().setActive(false);
            checkWinnerRed(node.getLeft());
        }
        if (node.getRight() != null) {
            node.getLeft().setActive(false);
            checkWinnerRed(node.getRight());
        }
                
        return false;
    }
}
