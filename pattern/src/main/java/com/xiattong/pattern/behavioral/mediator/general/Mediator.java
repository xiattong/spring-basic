package com.xiattong.pattern.behavioral.mediator.general;

// 抽象中介者
public abstract class Mediator {
    protected ConcreteColleagueA colleagueA;
    protected ConcreteColleagueB colleagueB;

    public void setColleageA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleageB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    // 中介者业务逻辑
    public abstract void transferA();

    public abstract void transferB();
}