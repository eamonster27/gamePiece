package com.company;

public class Main {

    public static void main(String[] args) {
        GamePiece gp = new GamePiece();
        for(int i = 0; i < 5; ++i){
            if(!gp.getFrozen()){
                gp.freeze();
                gp.move(i,2);
                System.out.print(gp.getPositionX());
                System.out.print(gp.getPositionY());
            }
            else {
                gp.unfreeze();
                gp.move(i,2);
                System.out.print(gp.getPositionX());
                System.out.print(gp.getPositionY());
            }
        }

    }
}
