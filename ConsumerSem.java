

/**
 * Created by halil on 12.01.2017.
 */

public class ConsumerSem extends Thread{
    private DataSem data;

    public ConsumerSem(DataSem data) {
        this.data = data;
    }

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
