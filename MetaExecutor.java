package org.zero.db.executor;

import org.zero.db.util.Constants;

public class MetaExecutor{
    public static boolean executeMetaCommand(String command){
        switch(command.substring(1)){
            case "exit":
                System.out.println("Exit command issued. Database stopped.");
                return true;
            default:
                return false;
        }
    }
}