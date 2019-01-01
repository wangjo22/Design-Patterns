package Observer;

public interface Subject {
    public void RegisterObserver(Observer obs);
    public void RemoveObserver(Observer obs);
    public void NotifyObservers();
}
