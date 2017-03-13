/**
 * Created by halil on 05.01.2017.
 */
public class Producer extends Thread{
    private Data data;

    public Producer(Data data) {
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
