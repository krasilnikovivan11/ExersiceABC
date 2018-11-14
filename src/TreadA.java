public class TreadA extends ThreadABCClass implements Runnable, Mark {
    @Override
    public void run() {
        synchronized (mark) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (symbol != 'C'){
                        mark.wait();
                    }
                    System.out.println("A");
                    setSymbol('A');
                    Thread.sleep(300);
                    mark.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
