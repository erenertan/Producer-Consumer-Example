import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by halil on 05.01.2017.
 */
public class Main {

    public static void main(String[] args) {

        ReentrantLock l = new ReentrantLock();
        Data data = new Data(l);

        Consumer consumer = new Consumer(data);
        Consumer consumer2 = new Consumer(data);
        Consumer consumer3 = new Consumer(data);

        Producer producer = new Producer(data);
        Producer producer2 = new Producer(data);
        Producer producer3 = new Producer(data);

        producer.start();
        producer2.start();
        producer3.start();

        consumer.start();
        consumer2.start();
        consumer3.start();
        /*


        DataSem dataSem = new DataSem();

        ConsumerSem consumerSem = new ConsumerSem(dataSem);
        ConsumerSem consumerSem2 = new ConsumerSem(dataSem);
        ConsumerSem consumerSem3 = new ConsumerSem(dataSem);

        ProducerSem producerSem = new ProducerSem(dataSem);
        ProducerSem producerSem2 = new ProducerSem(dataSem);
        ProducerSem producerSem3 = new ProducerSem(dataSem);

        producerSem.start();
        producerSem2.start();
        producerSem3.start();

        consumerSem.start();
        consumerSem2.start();
        consumerSem3.start();
        */
    }
}
