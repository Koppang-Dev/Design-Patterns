// This is a concrete strategy class
// THis implements the behaviour of the interface class

public class CurveGrading implements GradingStrategy {

    // Implements interface class
    @Override
    public int calculateGrade(int score) {
        return score + 10;
    }
}