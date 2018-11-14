public class TreadC extends ThreadABCClass implements Runnable, Mark {
    @Override
    public void run() {
        synchronized (mark) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (symbol != 'B') {
                        mark.wait();
                    }
                    System.out.println("C");
                    setSymbol('C');
                    Thread.sleep(300);
                    mark.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
