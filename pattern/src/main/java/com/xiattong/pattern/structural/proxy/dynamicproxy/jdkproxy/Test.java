package com.xiattong.pattern.structural.proxy.dynamicproxy.jdkproxy;


/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangsan = jdkMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();
        zhangsan.buyInsure();


        IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
        zhaoliu.findLove();
        zhaoliu.buyInsure();

    }
}
