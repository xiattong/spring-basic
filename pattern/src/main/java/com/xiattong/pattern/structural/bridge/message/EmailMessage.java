package com.xiattong.pattern.structural.bridge.message;

/**
 * Created by Tom.
 */
public class EmailMessage implements IMessage {
    public void send(String message, String toUser) {
        System.out.println("使用邮件消息发送" + message + "给" + toUser);
    }
}
