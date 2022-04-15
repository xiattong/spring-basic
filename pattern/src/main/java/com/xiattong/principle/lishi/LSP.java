package com.xiattong.principle.lishi;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：xiattong
 * @description：里氏替换 ：
 *      子类重载父类的方法时，方法的入参要比父类方法的入参更宽松（宽松？）
 * @version: $
 * @date ：Created in 2021/2/7 21:47
 * @modified By：
 */
public class LSP {
    class A {
        public void fun(HashMap map){
            System.out.println("父类被执行...");
        }
    }

    class B extends A{
        public void fun(Map map){
            System.out.println("子类被执行...");
        }
    }

    public static void main(String[] args){
        System.out.print("父类的运行结果：");
        LSP lsp =new LSP();
        LSP.A a= lsp.new A();
        HashMap<Object, Object> map=new HashMap<Object, Object>();
        a.fun(map);

        System.out.print("子类替代父类后的运行结果：");
        LSP.B b=lsp.new B();
        b.fun(map);
    }
}
