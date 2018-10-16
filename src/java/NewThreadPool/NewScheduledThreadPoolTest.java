package NewThreadPool;

import InheritTest.MyCallable;
import InheritTest.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//newScheduledThreadPool()方法，该方法返回一个SchededExecutorSrevice对象，但该线程池可以指定线程的数量。
public class NewScheduledThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newScheduledThreadPool(3);

        MyCallable callable = new MyCallable();
        MyRunnable runnable = new MyRunnable();
        for(int i = 0 ; i < 8; i++){
            //service.submit(callable);
            service.execute(runnable);
        }
    }
}
