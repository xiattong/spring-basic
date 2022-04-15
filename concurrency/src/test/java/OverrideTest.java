import java.io.Serializable;

/**
 * @Author: xiattong
 * @Date: 2020/3/22 12:29
 */
public class OverrideTest {
    public class Father implements Serializable {
        public void fun1(){
            System.out.println("father fun1");
            this.fun2();
        }
        public void fun2() {
            System.out.println("father fun2");

        }
    }

    public class Child extends Father {
        @Override
        public void fun1(){
            System.out.println("Child fun1");
            super.fun1();
        }

        @Override
        public void fun2() {
            System.out.println("Child fun2");
        }
    }

    public static void main(String[] args) {
        Father father = new OverrideTest().new Child();
        father.fun1();
    }
}