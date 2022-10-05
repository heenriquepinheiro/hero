package org.example;

import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Hero {
    private Screen screen;
    private Position position;

    public Hero(int i1, int i2){
        this.position.setX(i1);
        this.position.setY(i2);
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

    public void draw(Screen screen) throws IOException {
        this.screen.clear();
        this.screen.setCharacter(x, y, TextCharacter.fromCharacter('X')[0]);
        this.screen.refresh();
    }


}
