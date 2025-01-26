import java.sql.*;

public class CRUDOperations {
    private static final String URL = "jdbc:mysql://localhost:3306/bcis";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {
        String operation = "update"; 
        
        try {
            Class.forName(DRIVER);
            String query = "";
            switch (operation) {
                case "insert":
                    query = "INSERT INTO student(id, name, dob, age) VALUES(?, ?, ?, ?)";
                    break;
                case "update":
                    query = "UPDATE student SET name = ?, dob = ?, age = ? WHERE id = ?";
                    break;
                case "delete":
                    query = "DELETE FROM student WHERE id = ?";
                    break;
                default:
                    System.out.println("Invalid operation");
                    return;
            }

            try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                switch (operation) {
                    case "insert":
                        preparedStatement.setInt(1, 1);
                        preparedStatement.setString(2, "Ram");
                        preparedStatement.setDate(3, Date.valueOf("2002-01-01"));
                        preparedStatement.setInt(4, 20);
                        break;
                    case "update":
                        preparedStatement.setString(1, "Rama");
                        preparedStatement.setDate(2, Date.valueOf("2002-02-01"));
                        preparedStatement.setInt(3, 21);
                        preparedStatement.setInt(4, 1);
                        break;
                    case "delete":
                        preparedStatement.setInt(1, 1);
                        break;
                }

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Operation successful! Rows affected: " + rowsAffected);
                } else {
                    System.out.println("No rows affected or failed to execute the operation!");
                }
            } catch (SQLException e) {
                System.err.println("Database error occurred!");
                System.err.println("Error message: " + e.getMessage());
                System.err.println("SQL State: " + e.getSQLState());
                System.err.println("Error Code: " + e.getErrorCode());
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Error: MySQL JDBC Driver not found!");
            System.err.println("Make sure you have included the MySQL connector JAR in your classpath.");
            System.err.println("Error message: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred!");
            System.err.println("Error message: " + e.getMessage());
        }
    }
}
