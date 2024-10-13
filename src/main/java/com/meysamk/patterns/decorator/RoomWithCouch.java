package com.meysamk.patterns.decorator;

public class RoomWithCouch extends RoomDecorator{
    public RoomWithCouch(BasicRoom room) {
        super(room);
    }

    @Override
    public void printFurniture() {
        super.printFurniture();
        System.out.println("couch");
    }

}
