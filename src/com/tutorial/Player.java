package com.tutorial;

import com.terminal.Console;

public class Player {
    private String name;

    Player(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void show(){
        Console.log("nama : "+this.name);
    }
}
