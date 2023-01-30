public class HeavyClass implements Runnable{
    public void calculate() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Override
    public void run() {
        try {
            calculate();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
