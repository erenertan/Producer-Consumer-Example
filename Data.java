import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by halil on 05.01.2017.
 */
public class Data {

    private int number = 0;
    private ReentrantLock reentrantLock;

    public Data() {
    }

    public Data(int number) {
        this.number = number;
    }

    public Data(int number, ReentrantLock l) {
        this.number = number;
        this.reentrantLock = l;
    }

    public Data(ReentrantLock l) {
        this.reentrantLock = l;
    }


    /**
     * Method that used by producer objects.
     * Locks the variable and and prints it.
     * @param number value of the number
     * @throws InterruptedException
     */
    void generate(int number) throws InterruptedException {
        reentrantLock.lock();

        this.number = number;
        System.out.println("Producer: " + number);

        reentrantLock.unlock();
}

    /**
     * Method that used by consumer objects.
     * Gets the value of number paramater and prints it.
     * @throws InterruptedException
     */
    void consume() throws InterruptedException {

        reentrantLock.lock();
        System.out.println("Consumer: " + number);
        reentrantLock.unlock();
    }
}
