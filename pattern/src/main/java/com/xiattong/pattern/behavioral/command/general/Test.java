package com.xiattong.pattern.behavioral.command.general;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        ICommand cmd = new ConcreteCommand();
        //cmd.execute();

        Invoker invoker = new Invoker(cmd);
        //请求者请求命令
        invoker.ask();
    }
}
