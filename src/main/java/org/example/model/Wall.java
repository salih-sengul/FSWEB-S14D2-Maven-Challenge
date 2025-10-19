package org.example.model;

public class Wall {
    private String direction;

    public Wall(String direcion) {
        this.direction = direcion;
    }

    public String getDirection() {
        return direction;
    }

    public void create(){
        System.out.println("Wall has been built.");
    }
}
