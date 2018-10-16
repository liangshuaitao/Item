package NewThreadPool;

import InheritTest.MyCallable;
import InheritTest.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//newFixedThreadPool()方法，该方法返回一个固定数量的线程池，该方法的线程数始终不变，
// 当有一个任务提交时，若线程池中空闲，则立即执行，若没有，
// 则会被暫缓在一个任务队列中等待有空闲的线程去执行·
public class NewFixedThreadPoolTest {
    public static void main(String[] args) {

        //创建线程池对象
        ExecutorService service = Executors.newFixedThreadPool(2);
        //ExecutorService service = Executors.newFixedThreadPool(2);//包含2个线程对象

        //创建Runnable实例对象

        MyRunnable r = new MyRunnable();

        MyCallable callable = new MyCallable();

        //自己创建线程对象的方式

        //Thread t = new Thread(r);
        //t.start(); ---> 调用MyRunnable中的run()

        //从线程池中获取线程对象,然后调用MyRunnable中的run()
        service.submit(callable);

        //再获取个线程对象，调用MyRunnable中的run()
        service.submit(callable);

        service.submit(callable);

        //注意：submit方法调用结束后，程序并不终止，是因为线程池控制了线程的关闭。将使用完的线程又归还到了线程池中

        //关闭线程池

        service.shutdown();


    }
}

