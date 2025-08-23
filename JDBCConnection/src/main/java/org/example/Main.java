package org.example;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        //  getConnection();
        // createPosition("PM");
        // getPosition();
        //    updatePositionId5();
        //   deleteIdPosition(7);
    }


    private static Connection getConnection() throws IOException, SQLException {
        try {
            Properties properties = new Properties();
            properties.load(Main.class.getClassLoader().getResourceAsStream("application.properties"));
            String dbUrl = properties.getProperty("dbUrl");
            String userName = properties.getProperty("userName");
            String password = properties.getProperty("password");
            Connection connection = DriverManager.getConnection(dbUrl, userName, password);
            System.out.println("Connect success.");
            return connection;
        } catch (Exception e) {
            throw new RuntimeException("Connect fail!!!");
        }
    }

    // Question 2:
//Tạo method để in ra các thông tin của position gồm có id, name
    public static ArrayList<Position> getPosition() throws IOException, SQLException {
        Connection connection = getConnection();
        Statement statement = getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from Position");
        ArrayList<Position> positions = new ArrayList<>();

        while (resultSet.next()) {
            int positionId = resultSet.getInt(1);
            String positionName = resultSet.getString(2);
            Position position = new Position(positionId, positionName);
            positions.add(position);
        }
        positions.forEach(System.out::println);
        return positions;

    }

    //Question 3:
    //Tạo method để tạo position, user sẽ nhập vào name.
    public static int createPosition(String positionName) throws IOException, SQLException {

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = getConnection().prepareStatement("INSERT INTO `testing_system_assignment_1`.`position` (`PositionName`) VALUES (?);")) {
            preparedStatement.setString(1, positionName);
            return preparedStatement.executeUpdate();
        }
    }
    //Question 4:
    //Tạo method để update tên của position gồm có id = 5 thành "Dev".

    public static int updatePositionId5() throws SQLException, IOException {
        Connection connection = getConnection();
        int statement = getConnection().createStatement().executeUpdate("UPDATE `testing_system_assignment_1`.`position` SET `PositionName` = 'PM' WHERE (`PositionID` = '5')");

        return statement;

    }

    //Question 5:
    //Tạo method để delete của position theo id và user sẽ nhập vào id
    public static int deleteIdPosition(int positionId) throws SQLException, IOException {

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("Delete from Position where PositionId = ?");) {
            preparedStatement.setInt(1, positionId);

            int roweffect = preparedStatement.executeUpdate();
            if (roweffect > 0) {
                System.out.println(" Delete success positionId " + positionId);
            } else {
                System.out.println("Cannot find positionId " + positionId);
            }
            return roweffect;
        }


    }
}