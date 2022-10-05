package org.example;

import com.googlecode.lanterna.input.KeyStroke;

public class Arena {
    private int width;
    private int height;

    public Arena(int width_, int height_){
        this.width = width_;
        this.height = height_;
    }

     private void processKey(KeyStroke key) {
        System.out.println(key);
        if (key.getKeyType() == KeyType.ArrowUp) moveHero(hero.moveUp());
        if (key.getKeyType() == KeyType.ArrowDown) moveHero(hero.moveDown());
        if (key.getKeyType() == KeyType.ArrowRight) moveHero(hero.moveRight());
        if (key.getKeyType() == KeyType.ArrowLeft) moveHero(hero.moveLeft());
    }

}
