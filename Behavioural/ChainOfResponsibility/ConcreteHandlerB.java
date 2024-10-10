
// This is a concrete handler
// If the request is for this handler then it will process it
// If it is not then it will pass it along the chain

public class ConcreteHandlerB implements Handler {

    @Override
    public String handle(String request) {

        // Check to see if this handler was choosen to process
        if (request.equalsIgnoreCase("A")) {
            // Choosen to handle
            return "Handled by B";
        } else if (nextHandler != null) {
            // Calls the next in the chain to try and handle it
            return nextHandler.handle(request);
        }

        // Nobody else left in the chain
        return null
    }
}