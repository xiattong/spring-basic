import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xiattong
 * @Date: 2020/3/22 12:29
 */
public class  Test {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("2","2");
        map.put("1","1");
        map.put("6","6");
        map.put("5","5");
        map.put("3","3");
        map.put("4","4");


        for(String key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}