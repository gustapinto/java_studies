package fundamentals.threads;

// Thread podem ser criadas
class FooThread extends Thread {

    // run() é o método responsável por realizar o disparo da thread
    @Override
    public void run() {
        System.out.println(this.getClass().getName() + " thread started!");
    }

}