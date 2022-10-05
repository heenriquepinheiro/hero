package org.example;

import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game {
    private int x = 10;
    private int y = 10;
    public Game(){    }
    private void draw() throws IOException {
        Screen screen;
        screen = null;
        screen.clear();
        screen.setCharacter(x, y, TextCharacter.fromCharacter('X')[0]);
        screen.refresh();
    }
    void run() throws IOException {
        while (true) {
            draw();
            TerminalScreen screen = null;
            KeyStroke key = screen.readInput();
            if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'q') screen.close();
            if (key.getKeyType() == KeyType.EOF) break;
            processKey(key);

        }
    }
    private void processKey(KeyStroke key) {
        System.out.println(key);
        if (key.getKeyType() == KeyType.ArrowUp) y = y + 1;
        if (key.getKeyType() == KeyType.ArrowDown) y = y - 1;
        if (key.getKeyType() == KeyType.ArrowRight) x = x + 1;
        if (key.getKeyType() == KeyType.ArrowLeft) x = x - 1;
    }
}

