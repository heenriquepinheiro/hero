package org.example;

import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
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
        draw();
        TerminalScreen screen = null;
        KeyStroke key = screen.readInput();
        processKey(key);
    }
    private void processKey(KeyStroke key) {
        System.out.println(key);
    }
}

