package com.xiattong.pattern.behavioral.state.xiatt;

import sun.rmi.runtime.Log;

/**
 * @author ：xiattong
 * @description：定义客户端需要的接口，内部维护一个当前状态实例，并负责具体状态的切换
 * @version: $
 * @date ：Created in 2021/2/21 16:38
 * @modified By：
 */
public class AppContext {
    public static final AbstractState LOGIN_STATE = new LoginState();
    public static final AbstractState UN_LOGIN_STATE = new UnLoginState();
    private AbstractState currentState  = UN_LOGIN_STATE;
    {
        LOGIN_STATE.setContext(this);
        UN_LOGIN_STATE.setContext(this);
    }

    public void setCurrentState(AbstractState state){
        this.currentState = state;
    }

    public AbstractState getCurrentState(){
        return this.currentState;
    }

    public void favorite(){
        this.currentState.favorite();
    }

    public void comment(String comment){
        this.currentState.comment(comment);
    }

}
