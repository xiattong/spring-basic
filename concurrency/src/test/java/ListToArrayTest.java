import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：xiattong
 * @description：数组-集合互转测试
 * @version: $
 * @date ：Created in 2021/4/7 10:51
 * @modified By：
 */
public class ListToArrayTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");

        //array:[one, two, three]
        Object[] array = list.toArray();
        System.out.println("array:"+Arrays.asList(array));

        //[one, two, three]
        //array2:[null, null]
        String[] array2 = new String[2];
        System.out.println(Arrays.asList(list.toArray(array2)));
        System.out.println("array2:"+Arrays.asList(array2));

        //[one, two, three]
        //array3:[one, two, three]
        String[] array3 = new String[3];
        System.out.println(Arrays.asList(list.toArray(array3)));
        System.out.println("array3:"+Arrays.asList(array3));

        //[one, two, three, null]
        //array4:[one, two, three, null]
        String[] array4 = new String[4];
        System.out.println(Arrays.asList(list.toArray(array4)));
        System.out.println("array4:"+Arrays.asList(array4));
    }

}
