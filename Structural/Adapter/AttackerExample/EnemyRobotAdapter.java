
// ADAPTER
// Provides an alternative method for possible actions

public class EnemyRobotAdapter implements EnemyAttacker {

    // Create an instance of the uncompatible class
    EnemyRobot  theRobot;

    // Constructor
    public EnemyRobotAdapter(EnemyRobot robot) {
        this.theRobot = robot;
    }

    @Override
    public void fireWeapon() {
        
        // Calling alternative function instead
        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {

        // Calling alternative function instead
        theRobot.walkForward();


    }

    @Override
    public void assignDriver(string driverName) {


    }
}