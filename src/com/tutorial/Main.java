package com.tutorial;

import com.terminal.Console;
import static com.terminal.Console.log;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Jarwo");
        player1.show();
        System.out.println("Menampilkan dengan Console.log");
        Console.log(player1.getName());
        System.out.println("Menampilkan dengan Method log saja");
        log(player1.getName());
        
    }
}
