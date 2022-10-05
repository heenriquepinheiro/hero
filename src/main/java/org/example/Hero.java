package org.example;

import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Hero {
    private Screen screen;
    private Position position;

    public Hero(int i1, int i2){
        this.x = i1;
        this.y = i2;
    }

    public int getX() {return x;}
    public int getY() {return y;}
    public void setX(int new_x) {this.x = new_x;}
    public void setY(int new_y) {this.y = new_y;}

    public void moveUp(){
        this.y++;
    }
    public void moveDown(){
        this.y--;
    }
    public void moveRight(){
        this.x++;
    }
    public void moveLeft(){
        this.x--;
    }

    public void draw(Screen screen) throws IOException {
        this.screen.clear();
        this.screen.setCharacter(x, y, TextCharacter.fromCharacter('X')[0]);
        this.screen.refresh();
    }


}
