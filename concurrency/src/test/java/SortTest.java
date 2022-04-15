import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/5/19 15:27
 * @modified By：
 */
public class SortTest {

    public static class SortBean{
        public BigDecimal a;
        public BigDecimal b;

        public SortBean(BigDecimal a, BigDecimal b) {
            this.a = a;
            this.b = b;
        }

        public BigDecimal getA() {
            return a;
        }

        public void setA(BigDecimal a) {
            this.a = a;
        }

        public BigDecimal getB() {
            return b;
        }

        public void setB(BigDecimal b) {
            this.b = b;
        }

        @Override
        public String toString() {
            return "SortBean{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<SortBean> sortBeanList = new ArrayList<>();
        sortBeanList.add(new SortBean(BigDecimal.valueOf(2),BigDecimal.valueOf(1)));
        sortBeanList.add(new SortBean(BigDecimal.valueOf(3),BigDecimal.valueOf(1)));
        sortBeanList.add(new SortBean(BigDecimal.valueOf(4),BigDecimal.valueOf(1)));
        sortBeanList.add(new SortBean(BigDecimal.valueOf(5),BigDecimal.valueOf(1)));

        /**
         * sortBeanList = sortBeanList.stream()
                .sorted(
                        Comparator.comparing(SortBean::getA)
                                .thenComparing(Comparator.comparing(SortBean::getB).reversed()))
                .collect(Collectors.toList());

        for (SortBean bean : sortBeanList){
            System.out.println(bean.toString());
        }*/
        double re = sortBeanList.stream().collect(Collectors.summingDouble(x->{ return MoneyUtil.sub(x.getA(),x.getB()).doubleValue();}));
        System.out.println(re);
        System.out.println(sortBeanList.size());
        sortBeanList.clear();
        System.out.println(sortBeanList.size());
    }
}
