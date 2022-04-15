import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：xiattong
 * @description：数组-集合互转测试
 * @version: $
 * @date ：Created in 2021/4/7 10:14
 * @modified By：
 */
public class ArrayToListTest {
    public static void main(String[] args) {
        String[] stringArray = new String[]{"one","two","three"};

        // List<String> stringList = Arrays.asList(stringArray);
        List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));

        stringList.set(0,"1");

        System.out.println("Array:" + Arrays.toString(stringArray));

        System.out.println("List:" + Arrays.toString(stringList.toArray()));

        stringList.add("four");

        stringList.remove(2);

        stringList.clear();
    }
}
