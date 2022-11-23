package vlakno;

public class Runner extends Thread {

    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Hello " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
