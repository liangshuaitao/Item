package ThreadPool;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExecutorTest1 extends Thread{

    private static AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        try {
            int temp = count.incrementAndGet();
            System.out.println("任务" + temp+"   thread==="+Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{

        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(12);
        ExecutorService executor  = new ThreadPoolExecutor(5,6,120L,TimeUnit.SECONDS,queue, new MyRejected());

        for(int i = 0 ; i < 20; i++){
            executor.execute(new ThreadPoolExecutorTest1());
        }
        Thread.sleep(1000);
        System.out.println("queue size:" + queue.size());     //10
        Thread.sleep(2000);
    }

}
