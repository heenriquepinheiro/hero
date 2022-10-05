package org.example;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Monster extends Element{
    public Monster(int i1, int i2) {super(i1, i2);}

    @Override
    public void draw(TextGraphics graphics) {
        graphics.setBackgroundColor(TextColor.Factory.fromString("#01579B"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FF3333"));
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), "M");
    }

    public Position move(){

    }
}
