package org.example;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Arena {
    Hero hero;
    private int width;
    private int height;

    public Arena(int width_, int height_){
        this.width = width_;
        this.height = height_;
    }

     public void processKey(KeyStroke key) {

        if (key.getKeyType() == KeyType.ArrowUp) moveHero(hero.moveUp());
        if (key.getKeyType() == KeyType.ArrowDown) moveHero(hero.moveDown());
        if (key.getKeyType() == KeyType.ArrowRight) moveHero(hero.moveRight());
        if (key.getKeyType() == KeyType.ArrowLeft) moveHero(hero.moveLeft());
    }

    public boolean canHeroMove(Position position_){
        if (position_.getX() < 0) {return false;}
        if (position_.getX() > this.width - 1) {return false;}
        if (position_.getY() < 0) {return false;}
        if (position_.getY() > this.height - 1) {return false;}

        return true;
    }

    public void moveHero(Position position) {
        if (canHeroMove(position))
            hero.setPosition(position);
    }
    public void draw(Screen screen) throws IOException {
        screen.clear();
        hero.draw((TextGraphics) screen);
        screen.refresh();
    }
}
