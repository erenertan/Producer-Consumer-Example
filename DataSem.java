/**
 * Created by halil on 12.01.2017.
 */

public class DataSem {

    private int number = 0;
    private boolean permission = false;

    public DataSem() {
    }

    public DataSem(int number) {
        this.number = number;
    }

    synchronized void generate(int number) throws InterruptedException {

        if (!permission){
            this.number = number;
            System.out.println("Producer: " + number);

            permission = true;
            notify();


        } else {
            wait();
        }
    }

    synchronized void consume() throws InterruptedException {

        if (permission){
            System.out.println("Consumer: " + number);
            permission = false;
            notify();
        } else {
            wait();
        }
    }

}

