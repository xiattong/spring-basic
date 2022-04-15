package com.xiattong.principle.lishi;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：xiattong
 * @description：里氏替换
 *      当子类的方法实现父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更严格
 * @version: $
 * @date ：Created in 2021/2/7 21:53
 * @modified By：
 */
public class LSP1 {
    abstract class A {
        public abstract Map fun();
    }

    class B extends A{
        @Override
        public HashMap fun(){
            HashMap b=new HashMap();
            b.put("b","子类被执行...");
            return b;
        }
    }

    public static void main(String[] args){
        LSP1 lsp =new LSP1();
        LSP1.A a=lsp.new B();
        System.out.println(a.fun());
    }


}
