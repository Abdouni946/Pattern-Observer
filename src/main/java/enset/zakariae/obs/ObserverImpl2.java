package enset.zakariae.obs;

import enset.zakariae.obs.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history = new ArrayList<>();
    @Override
    public void update(int state) {
        System.out.println("-------------- OBS 2 ----------------");
        history.add(state);
        double sum = 0;
        for (Integer s : history) {
            sum += s;
        }
        System.out.println("average value ==>> " + sum / history.size());
    }
}
