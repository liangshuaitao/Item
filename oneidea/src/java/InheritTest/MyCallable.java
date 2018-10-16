package InheritTest;

import com.lst.test.InheritTest;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    public Object call() throws Exception {
        System.out.println("我要一个教练:call");

        Thread.sleep(2000);

        System.out.println("教练来了： " +Thread.currentThread().getName());

        System.out.println("教我游泳,交完后,教练回到了游泳池");

        return null;
    }
}
