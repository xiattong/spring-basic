/**
 * @author ：xiattong
 * @description：实参、形参测试
 * @version: $
 * @date ：Created in 2021/3/13 13:49
 * @modified By：无论是对于基本类型还是引用类型，java 中的参数传递都是值复制的传递过程。
 * 对于引用变量，复制指向对象的首地址，双方都可以通过自己的引用变量修改指向对象的相关属性。
 *
 */
public class ParamPassing {
    private static int intStatic = 222;
    private static String stringStatic = "old string";
    private static StringBuilder stringBuilderStatic = new StringBuilder("old stringBuilder");

    // A 方法
    public static void method(int intStatic){
        intStatic = 777;
    }
    // B 方法
    public static void method(){
        intStatic = 888;
    }
    // C 方法
    public static void method(String stringStatic){
        stringStatic = "new String";
    }

    // D 方法
    public static void method(StringBuilder stringBuilder1){
        stringBuilder1.append("111");
    }

    // F 方法
    public static void method(StringBuilder stringBuilder1, StringBuilder stringBuilder2){
        // 直接使用参数引用修改对象
        stringBuilder1.append(".method.first-");
        stringBuilder2.append(".method.second-");

        // 应用重新赋值
        stringBuilder1 = new StringBuilder("new StringBuilder");
        stringBuilder1.append("new method's append");
    }

    public static void main(String[] args) {
        method(intStatic);
        System.out.println(intStatic); // 222

        method();
        System.out.println(intStatic);// 888

        method(stringStatic);
        System.out.println(stringStatic); // old string

        method(stringBuilderStatic);
        System.out.println(stringBuilderStatic); //old stringBuilder111

        method(stringBuilderStatic,stringBuilderStatic);
        System.out.println(stringBuilderStatic); //old stringBuilder111.method.first-.method.second-
    }

}
