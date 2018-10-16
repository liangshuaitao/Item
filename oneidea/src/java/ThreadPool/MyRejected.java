package ThreadPool;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class MyRejected implements RejectedExecutionHandler {


    public MyRejected(){
    }


    @Override
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        System.out.println("自定义处理..");
        System.out.println("当前被拒绝任务为：" + runnable.toString());
    }
}
