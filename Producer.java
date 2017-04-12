/**
 * Created by halil on 05.01.2017.
 */
public class Producer extends Thread{
    private Data data;

    public Producer(Data data) {
        this.data = data;
    }


    /**
     * Generate a number between 1 and 10 and sends it to data class in every seconds.
     */
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
