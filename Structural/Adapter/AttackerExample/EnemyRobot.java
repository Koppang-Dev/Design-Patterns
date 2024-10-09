
// This is the ADAPTEE class

import java.util.random;

public class EnemyRobot {
    Random generator = new Random();

    public void smashWithHands() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy robot causes" + attackDamage + " damage with its hands");
    }

    public void walkForward() {
            int movemeent = generator.nextInt(5) + 1;
            System.out.println("Enemy walks " + movement + "spaces");
    }

    public void reactToHuman(string driverName) {
        System.out.println("Enemy robot tramps on " + driverName);
    }

}