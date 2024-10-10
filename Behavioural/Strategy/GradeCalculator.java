
// This is the clients code
// It has a Strategy interface class (Aggregation)
// The given Strategy can vary at runtime
// The client code will simply call the behaviour without knowning directly what strategy it is

public class GradeCalculator {

    // Reference to the Strategy interface
    private GradingStrategy strategy;

    // Constructor to initalize GradingStrategy
    public GradeCalculator(GradingStrategy strategy) {
        this.strategy = strategy;
    }

    // Calling behaviour of given strategy
    public int calculate(int score) {
        return strategy.calculateGrade(score);
    }

}