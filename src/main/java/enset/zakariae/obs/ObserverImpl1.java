package enset.zakariae.obs;

import enset.zakariae.obs.Observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int state) {
        System.out.println("-------------- OBS 1 ----------------");
        System.out.println("state value changed to " + state);
    }

}
