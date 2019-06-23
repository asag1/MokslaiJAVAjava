import java.time.LocalTime;

public class LygiagretusLengvas {


    public static void main(String[] args) throws InterruptedException {
        Thread timePrintingThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(4000);
                    System.out.println(LocalTime.now());
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                    break;
                }
            }
        }
        );
        timePrintingThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        timePrintingThread.interrupt();
    }
}