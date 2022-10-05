package org.example;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Hero extends Element{
    private Screen screen;
    private Position position;

    public Hero(int i1, int i2){super(i1,i2);}

    public Position getPosition(){
        return position;
    }

    public Position moveUp() {
        return new Position(position.getX(), position.getY() + 1);
    }
    public Position moveDown() {
        return new Position(position.getX(), position.getY() - 1);
    }
    public Position moveRight() {
        return new Position(position.getX() + 1, position.getY());
    }
    public Position moveLeft() {
        return new Position(position.getX() + 1, position.getY());
    }

    public void setPosition(Position position_){
        this.position = position_;
    }

    public void draw(TextGraphics graphics) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFF33"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), "X");
    }
}
