
// This is the Handler Interface
// This sets the next handler
// Defines the functionality that the handlers have

public interface Handler {

    // Defining the next handler
    protected Handler nextHandler;

    // Set the next handler
    public Handler setNext(Handler handler) {
        this.nextHanlder = handler;
        return handler;
    }

    // Behaviour to be implemented by children
    public abstract String handle(String request);
}