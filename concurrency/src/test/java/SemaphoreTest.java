import java.util.concurrent.Semaphore;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/4/22 21:31
 * @modified By：
 */
public class SemaphoreTest {

    public static void main(String[] args) {
        // 设定3个信号量
        Semaphore semaphore = new Semaphore(1);

        for (int i = 0; i < 30; i++){
            new SecurityCheckThread(i,semaphore).start();
        }
    }


    private static class SecurityCheckThread extends Thread {

        private int seq;

        private Semaphore semaphore;

        public SecurityCheckThread(int seq, Semaphore semaphore) {
            this.seq = seq;
            this.semaphore = semaphore;
        }


        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("开始检查乘客：" + seq);

                if (seq % 2 == 0) {
                    Thread.sleep(1000);
                    System.out.println("检查发现异常，禁止出境：" + seq);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
            super.run();
        }
    }
}
