package ThreadPool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 在使用有界队列时，若有新的任务需要执行，如果线程池实际线程数小于corePoolSize，则优先创建线程，
         * 若大于corePoolSize，则会将任务加入队列，
         * 若队列已满，则在总线程数不大于maximumPoolSize的前提下，创建新的线程，
         * 若线程数大于maximumPoolSize，则执行拒绝策略。或其他自定义方式。
         *
         */
        //          new ArrayBlockingQueue<Runnable>(2)          //指定
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,3,4, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>(), new MyRejected());

        MyTask mt1 = new MyTask(1, "任务1"+Thread.currentThread().getName());
        MyTask mt2 = new MyTask(2, "任务2"+Thread.currentThread().getName());
        MyTask mt3 = new MyTask(3, "任务3"+Thread.currentThread().getName());
        MyTask mt4 = new MyTask(4, "任务4"+Thread.currentThread().getName());
        MyTask mt5 = new MyTask(5, "任务5"+Thread.currentThread().getName());
        MyTask mt6 = new MyTask(6, "任务6"+Thread.currentThread().getName());
        MyTask mt7 = new MyTask(7, "任务7"+Thread.currentThread().getName());
        while (true){
            pool.execute(mt1);
            pool.execute(mt2);
            pool.execute(mt3);
            pool.execute(mt4);
            pool.execute(mt5);
            pool.execute(mt6);
            pool.submit(mt7,MyTask.class);

            Thread.sleep(3000);
        }


      //  pool.shutdown();
    }


}
