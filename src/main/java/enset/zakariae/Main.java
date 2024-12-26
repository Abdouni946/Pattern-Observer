package enset.zakariae;

import enset.zakariae.obs.ObservableImpl;
import enset.zakariae.obs.Observer;
import enset.zakariae.obs.ObserverImpl1;
import enset.zakariae.obs.ObserverImpl2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        observable.setState(90);
        observable.setState(100);
        Observer observer1 = new ObserverImpl1();
        observable.subscribe(observer1);
        observable.subscribe(new ObserverImpl2());
        observable.setState(200);
        observable.setState(50);
        observable.setState(60);
        observable.unsubscribe(observer1);
        System.out.println("*********************************************");
        observable.setState(70);
        observable.setState(80);

        observable.subscribe(new Observer() {
            @Override
            public void update(int state) {
                System.out.println("-------------- OBS 3 ----------------");
                System.out.println("prévision ==>> " + Math.random() * 100);
            }
        });

        observable.subscribe( state -> {
            System.out.println("-------------- OBS 4 ----------------");
            System.out.println("Tendance ==>> " + Math.random() * 100);
        });

        observable.setState(90);
    }
}
