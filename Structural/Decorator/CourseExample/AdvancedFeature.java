
// This is how a feature are added on

public class AdvancedFeature extends CourseDecorator {

    // Constructor
    public AdvancedFeature(Course course) {
        // Defining parent for polymorphism
        super(course)
    }

    // Overriding basic call with new feature
    @Override
    public String getDescription() {
        // Gets the basic course description from the parent (Course Decorator)
        return course.getDescription() + "Advanced Features";
    }
}