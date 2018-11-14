public class Main {
    public static void main(String[] args) {
        new Thread(new TreadA()).start();
        new Thread(new TreadB()).start();
        new Thread(new TreadC()).start();
    }
}
