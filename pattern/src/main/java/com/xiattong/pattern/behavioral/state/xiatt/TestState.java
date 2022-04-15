package com.xiattong.pattern.behavioral.state.xiatt;

/**
 * @author ：xiattong
 * @description：状态机测试
 * @version: $
 * @date ：Created in 2021/2/21 16:59
 * @modified By：
 */
public class TestState {
    public static void main(String[] args) {
        AppContext context = new AppContext();
        context.favorite();
        context.comment("Hello State");
    }
}
