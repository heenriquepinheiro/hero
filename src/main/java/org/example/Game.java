package org.example;

import com.googlecode.lanterna.TextCharacter;
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
        screen.setCharacter(10, 10, TextCharacter.fromCharacter('X')
                [0]);
        screen.refresh();
    }
    void run() throws IOException {
        draw();

    }
}

