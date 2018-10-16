package InheritTest;

import com.lst.test.InheritTest;

import java.util.logging.Logger;

public class MyRunnable implements Runnable {
    Logger logger = Logger.getAnonymousLogger();
    public void run() {
        logger.info("aaabbb");
        System.out.println("我要一个教练");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("教练来了： " +Thread.currentThread().getName());
        System.out.println("教我游泳,交完后，教练回到了游泳池");
    }
}
