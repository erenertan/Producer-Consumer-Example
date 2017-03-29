import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by halil on 05.01.2017.
 */
public class Data {

    private int number = 0;
    private ReentrantLock l;


    public Data() {
    }

    public Data(int number) {
        this.number = number;
    }

    public Data(int number, ReentrantLock l) {
        this.number = number;
        this.l = l;
    }

    public Data(ReentrantLock l) {
        this.l = l;
    }

    void generate(int number) throws InterruptedException {

        l.lock();
        this.number = number;
        System.out.println("Producer: " + number);

        l.unlock();
}

    void consume() throws InterruptedException {

        l.lock();
        System.out.println("Consumer: " + number);
        l.unlock();
    }
}
