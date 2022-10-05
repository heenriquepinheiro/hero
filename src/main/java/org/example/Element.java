package org.example;

import com.googlecode.lanterna.graphics.TextGraphics;

public abstract class Element {
    protected Position position;

    public Element(int i1, int i2){
        this.position = new Position(i1,i2);
    }
    public Position getPosition() {return position;}
    public void setPosition(Position position) {this.position = position;}

    public abstract void draw(TextGraphics graphics);
}
