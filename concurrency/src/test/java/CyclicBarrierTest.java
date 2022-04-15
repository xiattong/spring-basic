import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/4/22 21:52
 * @modified By：
 */
public class CyclicBarrierTest {
    public static void main(String[] args) {
        // 设定3个信号量
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        for (int i = 0; i < 30; i++){
            new CyclicBarrierTest.SecurityCheckThread(i,cyclicBarrier).start();
        }
    }

    private static class SecurityCheckThread extends Thread {

        private int seq;

        private CyclicBarrier cyclicBarrier;

        public SecurityCheckThread(int seq, CyclicBarrier cyclicBarrier) {
            this.seq = seq;
            this.cyclicBarrier = cyclicBarrier;
        }


        @Override
        public void run() {
            try {
                System.out.println("开始检查乘客：" + seq);
                if (seq % 2 == 0) {
                    Thread.sleep(1000);
                    System.out.println("检查发现异常，禁止出境：" + seq);
                }
                cyclicBarrier.await();
                System.out.println("检查完了：" + seq);
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            } finally {
               cyclicBarrier.reset();
            }
            super.run();
        }
    }
}
