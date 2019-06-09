/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Estudiante
 */
public class HexNode {
    private HexNode up_left;
    private HexNode up_right;
    private HexNode left;
    private HexNode right;
    private HexNode down_left;
    private HexNode down_right;
    
    private boolean active;
    private int color; // 1 naranja , 2 azul

    public HexNode() {
        this.active = false;
        this.color = 0;
    }

    public HexNode getUp_left() {
        return up_left;
    }

    public void setUp_left(HexNode up_left) {
        this.up_left = up_left;
    }

    public HexNode getUp_right() {
        return up_right;
    }

    public void setUp_right(HexNode up_right) {
        this.up_right = up_right;
    }

    public HexNode getLeft() {
        return left;
    }

    public void setLeft(HexNode left) {
        this.left = left;
    }

    public HexNode getRight() {
        return right;
    }

    public void setRight(HexNode right) {
        this.right = right;
    }

    public HexNode getDown_left() {
        return down_left;
    }

    public void setDown_left(HexNode down_left) {
        this.down_left = down_left;
    }

    public HexNode getDown_right() {
        return down_right;
    }

    public void setDown_right(HexNode down_right) {
        this.down_right = down_right;
    }
    
    


    
}
