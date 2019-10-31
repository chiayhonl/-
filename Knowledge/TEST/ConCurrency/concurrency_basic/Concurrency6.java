package TEST.ConCurrency.concurrency_basic;

/**
 * How to close the Thread graceful
 * @author Chiayhon
 * @create 2019 - 10 - 31
 */

public class Concurrency6 {

    private static class Worker extends Thread{
        boolean flag = true;
        @Override
        public void run() {
            while (flag) {
                try {
                    System.out.println("正在运行");
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println("线程结束");
                    break;//or return;
                }
            }
        }

        public  void shutdowm(){
            System.out.println("线程结束");
            this.flag = false;
        }
    }
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.start();

        for(int i = 10; i > 0; i--){
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        worker.interrupt();//the first way : interrupt
        worker.shutdowm();//the second way : shutDown
    }
}