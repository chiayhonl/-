package TEST.ConCurrency.concurrency_basic;

/**
 * Analog bank ticketing system
 *
 * @author Chiayhon
 * @create 2019 - 10 - 30
 */
public class Concurrentcy3 {
}

//version 1
class Bank{

}

class Ticket extends Thread{
    private static final int Max = 50;

    private static int Id = 1;

    private String name = "";

    @Override
    public void run() {
        while (Id < Max) {
            System.out.println(name + "当前服务的号码是" + Id++ );

        }
    }

    public Ticket(String name) {
        this.name = name;
    }
}

class WorkWindow{


    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("一号柜台");
        Ticket ticket2 = new Ticket("二号柜台");
        Ticket ticket3 = new Ticket("三号柜台");
        ticket1.start();
        ticket2.start();
        ticket3.start();
    }
}