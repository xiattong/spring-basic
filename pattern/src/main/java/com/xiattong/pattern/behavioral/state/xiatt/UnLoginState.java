package com.xiattong.pattern.behavioral.state.xiatt;

/**
 * @author ：xiattong
 * @description：具体状态角色-未登录状态
 * @version: $
 * @date ：Created in 2021/2/21 16:41
 * @modified By：
 */
public class UnLoginState extends AbstractState{

    @Override
    public void favorite() {
        switch2Login();
        this.getContext().getCurrentState().favorite();
    }

    @Override
    public void comment(String comment) {
        switch2Login();
        this.getContext().getCurrentState().comment(comment);
    }

    private void switch2Login(){
        System.out.println("跳转到登录页登录。。。");
        this.getContext().setCurrentState(AppContext.LOGIN_STATE);
    }
}
