import java.util.ArrayList;
import java.util.List;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/4/7 17:29
 * @modified By：
 */
public class SubListTest2 {
    public static void main(String[] args) {
        List<String> masterList = new ArrayList<>();
        masterList.add("1");
        masterList.add("2");
        masterList.add("3");

        for (String s : masterList) {
            if ("1".equals(s)) {
                masterList.remove(s);
            }
        }
        System.out.println(masterList);

    }
}
