
public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    
    public StockGrabber() {
        observers = new ArrayList<Observer>()
    }


    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = observer.indexOf(o);
    }

    @Override
    public void notifyObserver() {

        for(Observer observer : observers) {
            ovserver.update(ibmPrice, applPrice, googPrice);

        }

    }
}