/**
 * @author ：xiattong
 * @description：静态方法、静态代码块
 * @version: $
 * @date ：Created in 2021/3/13 14:51
 * @modified By：
 */
public class StaticCode {
    static String prior = "done";

    static String last = f() ? g() : prior;

    static boolean f(){
        return true;
    }

    static String g(){
        return "hello word";
    }

    public static void main(String[] args) {
        System.out.println(last);
    }

    static{
        System.out.println(last);
        g();
    }
}
