package fundamentals.threads;

import java.util.concurrent.Callable;

// Em java além de Threads e Runnables também possuimos o conceito de callables,
// que são uma forma de implementar Runnables que retornam algum valor do seu
// método de entrada (call())
public class FooCallable implements Callable<String> {

    public String call() {
        return this.getClass().getName() + " callable started!";
    }

}
