package com.dhan.cache;

enum Command {
    PING(1),
    GET(2),
    PUT(3),
    DELETE(2),
    DELETEALL(1),
    GETKEYS(1),
    INVALID(1);

    private int requiredParams;

    private Command(int params){
        this.requiredParams = params;
    }

    public int getRequiredParams(){
        return this.requiredParams;
    }
}

public class CommandOperation {

    //Move this to the command class itself
    public static Command getOperation(String[] args){
        Command c;
        if(args.length == 0){
            c = Command.INVALID;
            return c;
        }
        switch(args[0].toLowerCase()){
            case "ping":
                c = Command.PING;
                break;
            case "get":
                c = Command.GET;
                break;
            case "put":
                c = Command.PUT;
                break;
            case "delete":
                c = Command.DELETE;
                break;
            case "deleteall":
                c = Command.DELETEALL;
                break;
            case "getkeys":
                c = Command.GETKEYS;
                break;
            default:
                c = Command.INVALID;
        }
        return c;
    }
}
