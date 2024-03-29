/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author mi pc
 * @version June 08, 2019
 */
public class HexButton extends JButton implements ActionListener {

    private static final long serialVersionUID = 8703517515706326251L;
    Polygon bounds;
    Character character;
    Boolean clicked;

    static Color color;

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Color getColor() {
        return color;
    }

    public static void setColor(Color color) {
        color = color;
    }

    public HexButton(Color color) {
        this.color = color;
    }

    /**
     * Creates a hexagonal button with a single character label
     *
     * @param character
     */
    public HexButton() {
        this.calculateBounds();
        this.setBackground(Color.white);
        this.setForeground(Color.RED);
        this.clicked = false;
        this.setOpaque(true);
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setSize(40, 40);
        addActionListener((ActionListener) this);
        this.a = 0;
        this.b = 0;
    }

    /**
     * Creates a hexagon of certain height / width and ratio multiplier
     *
     * @param width
     * @param height
     * @param ratio
     * @return
     */
    private Polygon hexagon(int width, int height, double ratio) {
        Polygon hexagon = new Polygon();
        for (int i = 0; i < 6; i++) {
            int x = width / 2 + (int) ((width - 2) / 2 * Math.cos(i * 2 * Math.PI / 6) * ratio);
            int y = height / 2 + (int) ((height - 2) / 2 * Math.sin(i * 2 * Math.PI / 6) * ratio);
            hexagon.addPoint(y, x);
        }
        return hexagon;
    }

    private void calculateBounds() {
        this.bounds = this.hexagon(this.getWidth(), this.getHeight(), 1.0);
    }

    /**
     * Returns whether a certain point is within the bounds of this button.
     */
    @Override
    public boolean contains(Point p) {
        return this.bounds.contains(p);
    }

    /**
     * Returns whether supplied x,y coordinates is within the bounds of this
     * button.
     */
    @Override
    public boolean contains(int x, int y) {
        return this.bounds.contains(x, y);
    }

    /**
     * Sets the dimension of the button
     */
    @Override
    public void setSize(Dimension d) {
        super.setSize(d);
        this.calculateBounds();
    }

    /**
     * Sets the dimension of the button
     */
    @Override
    public void setSize(int w, int h) {
        super.setSize(w, h);
        this.calculateBounds();
    }

    /**
     * Sets the bounds of the button
     */
    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        this.calculateBounds();
    }

    /**
     * Sets the bounds of the button
     */
    @Override
    public void setBounds(Rectangle r) {
        super.setBounds(r);
        this.calculateBounds();
    }

    /**
     * Draws the button
     */
    @Override
    protected void paintComponent(Graphics graphics) {

        // Draw the black border
        graphics.setColor(Color.BLACK);
        Polygon stroke = this.hexagon(getWidth(), getHeight(), 1.05);
        graphics.drawPolygon(stroke);
        graphics.fillPolygon(stroke);

        // Draw the inside background
        Polygon inside = this.hexagon(getWidth(), getHeight(), 0.9);
        graphics.setColor(getBackground());
        graphics.drawPolygon(inside);
        graphics.fillPolygon(inside);

//        // Draw the label
//        Font font = new Font("Arial", Font.BOLD, 64);
//        graphics.setFont(font);
//        graphics.setColor(getForeground());
//        
//        FontMetrics fontMetrics = getFontMetrics( font );
//        int width = fontMetrics.stringWidth(this.character + "");
//        int height = fontMetrics.getHeight();
//        
//        graphics.drawString(this.character + "", (getWidth() - width) / 2 , (getHeight() + height - 25) / 2);
    }

    /**
     * Performs some visual changes and changes the logic clicked state.
     */
    public void click() {
        this.clicked = true;
        this.setBackground(Color.MAGENTA);
        this.setForeground(Color.BLACK);
    }

    /**
     * Returns the clicked state of the button
     */
    public Boolean isClicked() {
        return this.clicked;
    }

    //Editar este metodo para que cuando sea jugador 1 marque en azul, y jugador 2 marque en rojo
    @Override
    public void actionPerformed(ActionEvent e) {
        //Se asigna el color de fondo azul
        setBackground(color);
        HexBoard.addHexFile(this);
    }

}
