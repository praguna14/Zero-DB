package org.zero.db.util;

import java.io.Console;

public class IOUtil {
    public static String readInput(){
        Console console = System.console();

        String input = console.readLine("db >> ").trim();
        if(input.length() == 0){
            return "ERROR";
        } else{
            return input;
        }
    }
}
