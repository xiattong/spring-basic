package com.xiattong.pattern.behavioral.state.xiatt;

/**
 * @author ：xiattong
 * @description：具体状态角色-登录状态
 *  具体实现该状对应的行为，并且在需要的情况下进行状态切换
 * @version: $
 * @date ：Created in 2021/2/21 16:39
 * @modified By：
 */
public class LoginState extends AbstractState{

    @Override
    public void favorite() {
        System.out.println("加入收藏夹");
    }

    @Override
    public void comment(String comment) {
        System.out.println("写评论："+comment);
    }
}
