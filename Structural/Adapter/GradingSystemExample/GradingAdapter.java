
// This is the adapter class

public class GradingAdapter implements NewGradingSystem {

    // Creating an instance of our adaptee
    private OldGradingSystem oldSystem;

    // Constructor to initalize adaptee
    public GradingAdapter(OldGradingSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    // Overriding function to allow for adaptation
    @Override
    public void assignGrade(String name, int grade) {
        String oldGrade = Integer.toString(grade);
        oldSystem.assignOldGrade(student, oldGrade);
    }
}