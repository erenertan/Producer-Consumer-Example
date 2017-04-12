/**
 * Created by halil on 12.01.2017.
 */

public class ProducerSem extends Thread{

    private DataSem data;

    public ProducerSem(DataSem data) {
        this.data = data;
    }

    @Override
    public void run() {
        super.run();

        while (true){

            for (int i = 0; i < 10; i++){
                try {
                    data.generate(i);
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

