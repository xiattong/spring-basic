package com.xiattong.pattern.behavioral.command.general;

//请求者
public class Invoker {
    private ICommand mCmd;

    public Invoker(ICommand cmd) {
        this.mCmd = cmd;
    }

    public void ask() {

        this.mCmd.execute();
    }
}