package TEST.ConCurrency.concurrency_basic;

/**
 * Analog bank ticketing system
 *
 * @author Chiayhon
 * @create 2019 - 10 - 30
 */
public class Concurrency3 {
    public static void main(String[] args) {
//        new Bank1().start();
//        new Bank2().start();
        new Bank2().start();
    }
}

//version 1
class Bank1{
    public void start(){
        Ticket1 ticket1 = new Ticket1("一号柜台");
        Ticket1 ticket2 = new Ticket1("二号柜台");
        Ticket1 ticket3 = new Ticket1("三号柜台");
        ticket1.start();
        ticket2.start();
        ticket3.start();
    }
}

class Ticket1 extends Thread{
    private static final int Max = 50;

    private static int Id = 1;

    private String name = "";

    @Override
    public void run() {
        while (Id <= Max) {
            System.out.println(name + "当前服务的号码是" + Id++ );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Ticket1(String name) {
        this.name = name;
    }
}

//version 2
class Bank2{
    public void start(){
        final Ticket2 ticket2 = new Ticket2();
        Thread workWindow1 = new Thread(ticket2 , "workWindow1");
        Thread workWindow2 = new Thread(ticket2 , "workWindow2");
        Thread workWindow3 = new Thread(ticket2 , "workWindow3");
        workWindow1.start();
        workWindow2.start();
        workWindow3.start();
    }
}

class Ticket2 implements Runnable{
    private static int MaxID = 50;
    private static int ID = 1;


    @Override
    public void run() {
        while (ID <= MaxID) {
            System.out.println(Thread.currentThread().getName() + "服务的客户ID是" + (ID++));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//version 3
class Bank3{
    private final static int MaxID = 50;
    public void start(){
        final Runnable ticket = () -> {
            int ID = 0 ;
            while (ID <= MaxID) {
                System.out.println(Thread.currentThread().getName() + "服务的客户ID是：" + ID++);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread workWindow1 = new Thread(ticket , "workWindow1");
        Thread workWindow2 = new Thread(ticket , "workWindow2");
        Thread workWindow3 = new Thread(ticket , "workWindow3");
        workWindow1.start();
        workWindow2.start();
        workWindow3.start();
    }
}
