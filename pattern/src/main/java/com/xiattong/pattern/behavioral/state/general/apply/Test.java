package com.xiattong.pattern.behavioral.state.general.apply;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(Context.STATE_A);
        context.handle();
    }
}
