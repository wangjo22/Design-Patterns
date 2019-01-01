package Observer;

import java.util.ArrayList;
import java.util.List;

public class MarriageEventSubject implements Subject {

    private List<Observer> observers;
    private String location;
    private String date;
    private String bride;
    private String groom;
    private int numGuest;

    public MarriageEventSubject() {
        this.observers = new ArrayList<Observer>();
        this.location = "";
        this.date = "";
        this.bride = "";
        this.groom = "";
        this.numGuest = 0;
    }

    @Override
    public void RegisterObserver(Observer obs) {
        this.observers.add(obs);
    }

    @Override
    public void RemoveObserver(Observer obs) {
        this.observers.remove(obs);
    }

    @Override
    public void NotifyObservers() {
        for(Observer obs : this.observers) {
            obs.update(this.location, this.date, this.bride, this.groom, this.numGuest);
        }
    }


}
