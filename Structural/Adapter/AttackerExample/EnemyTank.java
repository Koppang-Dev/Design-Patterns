import java.util.random;

public class EnemyTank implements EnemyAttacker {

    Random generator = new Random();

    // Override interface member functions
    @Override
        public void fireWeapon() {
            int attackDamage = generator.nextInt(10) + 1
            System.out.println("Enemy Tank Does" + attackDamage + "Damage");
        }

    @Override
        public void driveForward() {
            int movemeent = generator.nextInt(5) + 1;
            System.out.println("Enemy Tank movees" + movement + "spaces");
              

        }
    
    @Override
        public void assignDriver(string driverName) {
            System.out.println(driverName + " is driving the tank");
        }


}