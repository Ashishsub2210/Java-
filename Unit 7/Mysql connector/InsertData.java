import java.sql.*;

public class InsertData {
    private static final String URL = "jdbc:mysql://localhost:3306/bcis";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    public static void main(String[] args) {
        try {
            Class.forName(DRIVER);
            String query = "INSERT INTO student(id, name, dob, age) VALUES(?, ?, ?, ?)";
            
            try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                
                preparedStatement.setInt(1, 1);
                preparedStatement.setString(2, "Ram");
                preparedStatement.setDate(3, Date.valueOf("2002-01-01"));
                preparedStatement.setInt(4, 20);
                
                int rowsAffected = preparedStatement.executeUpdate();
                
                if (rowsAffected > 0) {
                    System.out.println("Data inserted successfully! Rows affected: " + rowsAffected);
                } else {
                    System.out.println("Failed to insert data!");
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