package vs.test.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class ConcurrentUtils {

    public static void stop(ExecutorService executorService) {
        executorService.shutdown();

        while (!executorService.isTerminated()) {

        }
    }

    public static void sleep(int milliSec) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
