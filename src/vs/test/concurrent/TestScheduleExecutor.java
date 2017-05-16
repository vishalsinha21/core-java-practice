package vs.test.concurrent;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestScheduleExecutor {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        System.out.println("process starts " + new Date());
        scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("scheduling at " + new Date()), 2, 5, TimeUnit.SECONDS);
    }
}
