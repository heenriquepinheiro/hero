package org.example;

public class Position {
    private int x;
    private int y;

    public Position(int i1, int i2){
        this.x = i1;
        this.y = i2;
    }

    public int getX() {return x;}
    public int getY() {return y;}
    public void setX(int new_x) {this.x = new_x;}
    public void setY(int new_y) {this.y = new_y;}
}
