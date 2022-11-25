package vlakno5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

    Random random = new Random();

    List<Integer> list = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();

    public void stageOne()
    {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        list.add(random.nextInt(100));
    }

    public void stageTwo()
    {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list1.add(random.nextInt(100));
    }
}
