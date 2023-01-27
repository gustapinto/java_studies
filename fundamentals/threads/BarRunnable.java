package fundamentals.threads;

// Threads em java também podem ser implementadas a partir da interface
// Runnable, que oferece uma forma mais leve de declarar threads
public class BarRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(this.getClass().getName() + " runnable started!");
    }

}
