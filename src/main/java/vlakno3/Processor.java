package vlakno3;

public class Processor extends Thread {


        public volatile boolean running = true;

        @Override
        public void run() {
            while (running) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public void shutdown() {
            running = false;
        }
}
