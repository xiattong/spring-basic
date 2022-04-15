package com.xiattong.pattern.behavioral.state.xiatt;

/**
 * @author ：xiattong
 * @description：抽象状态角色，定义该状态下的行为，可以有一个或多个行为
 * @version: $
 * @date ：Created in 2021/2/21 16:38
 * @modified By：
 */
public abstract class AbstractState {
    private AppContext context;

    public void setContext(AppContext context){
        this.context = context;
    }

    public AppContext getContext(){
        return context;
    }

    public abstract void favorite();

    public abstract void comment(String comment);
}
