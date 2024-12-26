package enset.zakariae.obs;


import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private int state = 0;
    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this.state);
        }
    }

    public void setState(int state) {
        this.state = state;
        notifyObserver();
    }

    public int getState() {
        return this.state;
    }
}
