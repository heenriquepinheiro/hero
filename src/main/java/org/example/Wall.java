package org.example;

public class Wall {
    private int x;
    private int y;
    Position position;

    public Wall(int i1, int i2) {
        this.x = i1;
        this.y = i2;
    }

    public Position getPosition() {

        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
