public class TreadB extends ThreadABCClass implements Runnable, Mark {
    @Override
    public void run() {
        synchronized (mark) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (symbol != 'A') {
                        mark.wait();
                    }
                    System.out.println("B");
                    setSymbol('B');
                    Thread.sleep(300);
                    mark.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
