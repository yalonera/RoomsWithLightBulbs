package by.neronskaya.dao;

import by.neronskaya.bean.Room;
import by.neronskaya.resource.MySQLConnUtils;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomDao {
    final static Logger logger = Logger.getLogger(RoomDao.class);
    Connection connection;

    public List<Room> getRoomList() throws SQLException, ClassNotFoundException {
        MySQLConnUtils.getMySQLConnection();
        List<Room> roomList = new ArrayList<>();
        String sql = "select * from roomsdb.rooms;";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String country = resultSet.getString("country");
            String countryCode = resultSet.getString("countryCode");

            Room room = new Room(id, name, country, countryCode);
            roomList.add(room);
        }
        resultSet.close();
        statement.close();
        MySQLConnUtils.disconnect();
        logger.info("displays a list of rooms");
        return roomList;
    }

    public void addRoom(Room room) throws SQLException, ClassNotFoundException {
        MySQLConnUtils.getMySQLConnection();
        String sql = "insert into roomsdb.rooms(id,name,country,countryCode) values (?,?,?,?);";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, room.getId());
        statement.setString(2, room.getName());
        statement.setString(3, room.getCountry());
        statement.setString(4, room.getCountryCode());
        statement.executeUpdate();
        statement.close();
        MySQLConnUtils.disconnect();
        logger.info("adding new room");
    }
}
