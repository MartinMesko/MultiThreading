package vlakno2;

public class App {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {

            for (int i = 1; i <= 10; i++)
            {
                System.out.println("Hello " + i);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();

    }
}
