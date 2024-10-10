// This is the simple concrete class for the implemenation of Course
// All features will have at least this implementation with their additional feature

public class SimpleCourse implements Course {

    // All feature classes will be using this
    @Override
    public String getDescription() {
        return "Basic Course";
    }
    
}