import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by halil on 05.01.2017.
 */
public class Consumer extends Thread{
    private Data data;
    private ReentrantLock l;

    public Consumer(Data data) {
        this.data = data;
    }

    public Consumer(Data data, ReentrantLock l) {
        this.data = data;
        this.l = l;
    }

    /**
     * Always calls consume method from data class in every seconds.
     */
    @Override
    public void run() {
        super.run();

        while (true){
            try {
                data.consume();
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}