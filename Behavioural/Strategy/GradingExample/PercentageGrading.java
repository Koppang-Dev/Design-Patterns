
// This class implements the GradingStrategy interface

public class PercentageGrading implements GradingStrategy {
    
    // Implementing interface behaviour
    @Override
    public int calculateGrade(int score) {
        return score;
    }
}