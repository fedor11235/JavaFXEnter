package sample;

import java.sql.*;

public class DatabaseHandler extends Config{
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString ="jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName; //строка подключения к бд
        Class.forName("com.mysql.jdbc.Driver"); //какой драйвер используем

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection; //возвращает полный метод подключения к бд
    }

    public void signUpUser(String name, String login, String password) throws SQLException, ClassNotFoundException { //для регистрации
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" +
                Const.USER_NAME + "," + Const.USER_LOGIN + "," +
                Const.USER_PASSWORD + ")" + "VALUES(?, ?, ?)";

        PreparedStatement prSt = getDbConnection().prepareStatement(insert);
        prSt.setString(1, name);
        prSt.setString(2, login);
        prSt.setString(3, password);

        prSt.executeUpdate();
    }

    public ResultSet getUser(User user) throws SQLException, ClassNotFoundException { //массив возвращающий данные пользователя
        ResultSet resSet = null;

        String select ="SELECT * FROM " + Const.USER_TABLE + " WHERE "+
                Const.USER_LOGIN + "=? AND "+ Const.USER_PASSWORD + "=?";

        PreparedStatement prSt = getDbConnection().prepareStatement(select);
        prSt.setString(1, user.getName());
        prSt.setString(2, user.getLogin());

        prSt.executeQuery();

        return resSet;

    }

}
