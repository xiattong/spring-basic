import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author ：xiattong
 * @description：TreeMap 和 HashMap的测试
 * @version: $
 * @date ：Created in 2021/4/15 17:37
 * @modified By：
 */
public class TreeHashMapTest {

    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(new key(),1);
        treeMap.put(new key(),2);
        System.out.println(treeMap.size());

        HashMap hashMap = new HashMap();
        hashMap.put(new key(),1);
        hashMap.put(new key(),2);
        System.out.println(hashMap.size());

    }
}

class key implements Comparable<key>{
    @Override
    public int compareTo(key o) {
        return -1;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
