package Observer;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();
    abstract public void RegisterObserver(Observer obs);
    abstract public void RemoveObserver(Observer obs);
    abstract public void NotifyObservers();
}