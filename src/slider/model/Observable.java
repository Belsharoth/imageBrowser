package slider.model;

import java.util.ArrayList;

public abstract class Observable {
    private ArrayList<Observer> observerList;

    public Observable() {
        observerList = new ArrayList<>();
    }
    
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }
    
    protected void notifyChanges() {
        for (Observer observer : observerList)
            observer.notifyChanges();
    }
    
    

}
