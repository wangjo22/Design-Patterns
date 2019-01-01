package Observer;

import java.util.ArrayList;
import java.util.List;

public class MarriageEvent implements Subject {

    private List<Observer> observers;
    private String location;
    private String date;
    private String bride;
    private String groom;
    private int numGuest;

    public MarriageEvent(String location, String date, String bride, String groom, int numGuest) {
        this.observers = new ArrayList<Observer>();
        this.location = location;
        this.date = date;
        this.bride = bride;
        this.groom = groom;
        this.numGuest = numGuest;
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

    public void EventChanged() {
        this.NotifyObservers();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
        this.EventChanged();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
        this.EventChanged();
    }

    public String getBride() {
        return bride;
    }

    public void setBride(String bride) {
        this.bride = bride;
        this.EventChanged();
    }

    public String getGroom() {
        return groom;
    }

    public void setGroom(String groom) {
        this.groom = groom;
        this.EventChanged();
    }

    public int getNumGuest() {
        return numGuest;
    }

    public void setNumGuest(int numGuest) {
        this.numGuest = numGuest;
        this.EventChanged();
    }
}
