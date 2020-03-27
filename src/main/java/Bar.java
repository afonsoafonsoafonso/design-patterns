import java.util.ArrayList;
import java.util.List;

abstract class Bar {
    boolean happy_hour;
    List<BarObserver> observers;

    public Bar() {
        this.happy_hour = false;
        this.observers = new ArrayList<>();
    }

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }

    public boolean isHappyHour() {
        if (happy_hour) return true;
        else return false;
    }

    public void startHappyHour() {
        this.happy_hour = true;
        this.notifyObservers();
    }

    public void endHappyHour() {
        this.happy_hour = false;
        this.notifyObservers();
    }
}
