package NewThreadPool;

import InheritTest.MyCallable;
import InheritTest.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//newCachedThreadPool()方法，返回一个可以根据实际情况调整线程个数的线程池，
// 不限制最大线程数量，若用空闲的线程则执行任务，若无任务则不创建线程。
// 并且每一个空闲线程会在60秒后自动回收。
public class NewCachedThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();

        MyCallable callable = new MyCallable();

        MyRunnable runnable = new MyRunnable();

        for(int i = 0 ; i < 5; i++){
            if (i==3){
                try {
                    Thread.sleep(70000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            service.execute(runnable);
        }
    }


}
