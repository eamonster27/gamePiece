package com.company;

public class GamePiece {
    private int positionX;
    private int positionY;
    private boolean frozen;
    private String name;
    private String color;

    public GamePiece(){
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
    }

    public int getPositionX(){
        return this.positionX;
    }

    public int getPositionY(){
        return this.positionY;
    }

    public boolean getFrozen(){
        return this.frozen;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String new_name){
        this.name = new_name;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String new_color){
        this.color = new_color;
    }

    public void move(int x, int y){
        if(!this.frozen){
            this.positionX = x;
            this.positionY = y;
        }

    }

    public void freeze(){
        this.frozen = true;
    }

    public void unfreeze(){
        this.frozen = false;
    }



}
