package NewThreadPool;

import InheritTest.MyRunnable;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TastThread {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(3);
        service.scheduleAtFixedRate(new MyRunnable(),0,3,TimeUnit.SECONDS);
       // MyRunnable r = new MyRunnable();
        service.scheduleAtFixedRate(new MyRunnable(),0,3,TimeUnit.SECONDS);
        //service.submit(r);
        service.scheduleAtFixedRate(new MyRunnable(),0,3,TimeUnit.SECONDS);

    }
}
