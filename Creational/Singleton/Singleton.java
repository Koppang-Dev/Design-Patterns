// Singleton ensures there is only one instance of the class
// Provides a global point to access it

public class DatabaseConnection {

    // Creates its instance
    DatabaseConnection instance;

    // Constructor
    public DatabaseConnection() {}

    // Returns the instance
    // If the instance it already created then return it
    // Otherwise, create the instance and then return it
    public static DatabaseConnection getInstance() {

        // If not created already
        if (instance == null) {
            instance = new DatabaseConnection();
        }

        // Returning instance
        return instance;
    }
}