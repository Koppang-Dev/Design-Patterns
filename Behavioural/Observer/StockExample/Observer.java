// This is the observer class
// Is an Interface that gets called by the subject
// Duty is to notify all of the subscribers

public interface Observer {

    public void update(double ibmPrice, double applPrice, double googPrice);

}