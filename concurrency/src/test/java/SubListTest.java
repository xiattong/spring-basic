import java.util.ArrayList;
import java.util.List;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/4/7 17:29
 * @modified By：
 */
public class SubListTest {
    public static void main(String[] args) {
        List<String> masterList = new ArrayList<>();
        masterList.add("1");
        masterList.add("2");
        masterList.add("3");
        masterList.add("4");
        masterList.add("5");

        List<String> branchList = masterList.subList(0,3);

        masterList.remove(0);
        masterList.add("10");
        System.out.println(masterList);
        //masterList.clear();

        /*branchList.clear();
        //4,5
        System.out.println(masterList);
        branchList.add("6");
        //6,4,5
        System.out.println(masterList);
        branchList.add("7");
        //6,7,4,5
        System.out.println(masterList);
        branchList.remove(0);

        //7
        System.out.println(branchList);
        //7,4,5
        System.out.println(masterList);*/
    }
}
