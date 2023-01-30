public class HeaveyClass2 {

    public void calculate() throws InterruptedException {
        System.out.println("Outside thread running");
        Thread.sleep(5000);
        new ThreadClass() {
            @Override
            public void run() {

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("inside thread");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.run();

        Thread.sleep(5000);
        System.out.println("Outside thread resumed");
    }
}
