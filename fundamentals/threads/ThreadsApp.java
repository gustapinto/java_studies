package fundamentals.threads;

import fundamentals.threads.FooThread;

import java.util.concurrent.FutureTask;

import fundamentals.threads.BarRunnable;
import fundamentals.threads.FooCallable;

public class ThreadsApp {
    public static void main(String[] args) throws Exception {
        // Instanciando uma thread que extende a classe Thread
        var fooThread = new FooThread();
        fooThread.start(); // Dispara a Thread

        // Instanciando uma thread usando a classe Thread e uma classe anonima
        var t = new Thread() {
            public void run() {
                System.out.println(this.getClass().getName() + " anonymous thread started!");
            }
        };
        t.start();

        // Instanciando uma thread que usa a interface Runnable
        var barThread = new Thread(new BarRunnable());
        barThread.start();
        barThread.join(); // Espera a thread terminar de executar

        

        // Instanciando um callable e usando seu resultado
        var fooFuture = new FutureTask<String>(new FooCallable());
        var fooFutureThread = new Thread(fooFuture);
        fooFutureThread.start();

        // <Future>.get() trava a execução do programa esperando pelo resultado
        // retornado pelo Future, atuando como um "await"
        System.out.println(fooFuture.get());
    }
}
