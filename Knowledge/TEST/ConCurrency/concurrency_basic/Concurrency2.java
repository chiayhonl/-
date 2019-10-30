package TEST.ConCurrency.concurrency_basic;

/**
 * how to start a new thread?
 *
 * @author Chiayhon
 * @create 2019 - 10 - 30
 */
public class Concurrency2 {
    public static void main(String[] args) {
        //the first way
        Thread thread1 = new Thread("thread1"){
            @Override
            public void run() {
                for(int i = 0; i <= 100; i++){
                    try {
                        System.out.println(Thread.currentThread().getName() + ":" +i);
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread1.start();

        //the second way
       Thread2 thread2 = new Thread2("thread2");
       thread2.start();


    }
}

class Thread2 extends Thread{

    @Override
    public void run() {
        for(int j = 0; j <= 50 ; j++){
            try {
                System.out.println(getName() + ":   " + j);
                sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Thread2(String name) {
        super(name);
    }
}