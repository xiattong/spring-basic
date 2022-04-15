import model.EqualsObject;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/4/7 16:56
 * @modified By：
 */
public class EqualsObjectTest {
    public static void main(String[] args) {
        Set<EqualsObject> set = new HashSet<>();

        EqualsObject a = new EqualsObject(1,"one");
        EqualsObject b = new EqualsObject(1,"one");
        EqualsObject c = new EqualsObject(1,"one");

        set.add(a);
        set.add(b);
        set.add(c);

        System.out.println(set.size());
    }
}
