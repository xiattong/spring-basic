package com.xiattong.pattern.behavioral.chain.auth.optimiaze;

import com.xiattong.pattern.behavioral.chain.auth.Member;

/**
 * Created by Tom.
 */
public abstract class Handler {
    protected Handler next;

    public void next(Handler next){
        this.next = next;
    }

    public abstract void doHandler(Member member);
}
