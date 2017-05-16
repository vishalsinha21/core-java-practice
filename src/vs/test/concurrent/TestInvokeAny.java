package vs.test.concurrent;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.util.Arrays.asList;

public class TestInvokeAny {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);

        List<Callable<String>> callables = asList(new PersonJob("vishal"), new PersonJob("rajat"), new PersonJob("nishant"));
        try {
            String result = es.invokeAny(callables);
            System.out.println("the one to leave faster than others is : " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        
        es.shutdown();
        
        while(!es.isTerminated()) {
            
        }

        System.out.println("someone has left the building");
    }
    
}

class PersonJob implements Callable<String> {

    private String name;

    public PersonJob(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println(name + " enters the building");
        System.out.println(name + " has left the building");
        return name;
    }

}