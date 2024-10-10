
// This is where the decorators are defined
// This class 'owns' the interface through compositon

public abstract class CourseDecorator implements Course {
    // Wrapped object
    Course course;

    // Constructor to initalize course
    public CourseDecorator(Course course) {
        this.course = course;
    }

    // Delegate calls
    @Override 
    public String getDescription() {
        return course.getDescription();
    }
}