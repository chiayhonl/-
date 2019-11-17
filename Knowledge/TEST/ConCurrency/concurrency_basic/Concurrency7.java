package TEST.ConCurrency.concurrency_basic;

/**
 * @author Chiayhon
 * @create 2019 - 10 - 31
 */
public class Concurrency7 {

    public static void main(String[] args) {
        Task task = new Task();

        task.excute(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        task.shutDown(10_000);
    }
}

class Task{

    boolean flag = true;

    Thread ExecutionThread;

    long i;

    public void excute(Runnable task){
        ExecutionThread = new Thread(){
            @Override
            public void run() {
                Thread DaemonThread = new Thread(task);

                DaemonThread.setDaemon(true);

                DaemonThread.start();

                try {
                    DaemonThread.join();
                    flag = false;
                    System.out.println("任务结束");
                } catch (InterruptedException e) {
                    System.out.println("执行线程的阻塞被中断");
                }
            }
        };

        ExecutionThread.start();
    }

    public void shutDown(long mills){
        long currentTime = System.currentTimeMillis();
        i = mills / 1000;
        while (flag){
            if(System.currentTimeMillis() - currentTime >= mills) {
                System.out.println("超时线程未结束，将强制终止");
                ExecutionThread.interrupt();
                break;
            }

            try {
                System.out.println(i--);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("执行线程被中断");
                break;
            }
        }

        flag = false;
    }
}