package TEST.ConCurrency.concurrency_basic;

/**
 * test if the main thread exist
 *
 * @author Chiayhon
 * @create 2019 - 10 - 30
 */
public class Concurrency1 {

    public static void main(String[] args) {
        /*The command to view the Thread(enter it in command window):
         *      E:\PROJECT\experience> jps
         *      E:\PROJECT\experience> jconsole (Thread's id)
         */
        println();
    }

    private static void println() {

        try {
            System.out.println("test start and sleep for a while");
            for(int i = 100 ; i > 0; i--){
                //sleep 100 second
                System.out.println(i);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("test finish");
        }
    }
}
