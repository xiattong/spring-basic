/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/4/24 21:12
 * @modified By：
 */
public class InnerStaticClassTest {

    public static class InnerStatic{

    }

    public static void main(String[] args) {
        InnerStaticClassTest test1 = new InnerStaticClassTest();
        InnerStatic innerStatic1 = new InnerStaticClassTest.InnerStatic();

        InnerStaticClassTest test2 = new InnerStaticClassTest();
        InnerStatic innerStatic2 = new InnerStaticClassTest.InnerStatic();

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test1 == test2);

        System.out.println(innerStatic1);
        System.out.println(innerStatic2);
        System.out.println(innerStatic1 == innerStatic2);



    }
}
