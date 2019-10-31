package TEST.ConCurrency.concurrency_basic;

/**
 * Daemon thread
 *
 * @author Chiayhon
 * @create 2019 - 10 - 31
 */
public class Concurrency5 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " running");
        Thread t = new Thread(() -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() + "正在运行");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } , "子线程");

        t.setDaemon(true);//将t设置为守护线程

        t.start();
        for(int i =10; i > 0; i--){
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }

}
