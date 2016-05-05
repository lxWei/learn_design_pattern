package observer.custom;

/**
 * Created by lx on 16/5/5.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
