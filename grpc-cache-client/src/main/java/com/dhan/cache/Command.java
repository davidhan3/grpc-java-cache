package com.dhan.cache;

public enum Command {
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
