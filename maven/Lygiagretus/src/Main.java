public class Main {

    public static void main(String[] args) throws InterruptedException {
        ProgressBar progressBar = new ProgressBar();
        Thread printingThread = new Thread(() -> {
            while (true) {
                try {
                    System.out.println(progressBar.getProgress());
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("aaaa");
                    break;
                }
            }
        }
        );
        printingThread.start();
        for (int i = 0; i > 10; i++) {
            progressBar.setProgress(progressBar.getProgress()+1);
            Thread.sleep(1000);
        }
//        printingThread.interrupt();
    }
}
