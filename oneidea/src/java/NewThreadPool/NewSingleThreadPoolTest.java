package NewThreadPool;

import InheritTest.MyCallable;
import InheritTest.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//newSingleThreadExecutor()方法，创建一个线程的程池，若空闲则执行，若没有空闲线程则暂缓在任务列队中。
public class NewSingleThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();


        //创建Runnable实例对象

        MyRunnable r = new MyRunnable();

        MyCallable callable = new MyCallable();

        for(int i = 0 ; i < 2; i++){
          service.execute(r);
        }

    }
}
