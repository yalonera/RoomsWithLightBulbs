package by.neronskaya.dao;

import by.neronskaya.bean.Room;
import by.neronskaya.resource.MySQLConnUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomDao {
    Connection connection;


    public List<Room> getRoomList() throws SQLException, ClassNotFoundException {
        List<Room> roomList = new ArrayList<>();
        String sql = "select * from roomsdb.rooms;";
        MySQLConnUtils.getMySQLConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int idRoom = resultSet.getInt("idRoom");
            String roomName = resultSet.getString("roomName");
            String country = resultSet.getString("country");
            String countryCode = resultSet.getString("countryCode");

            Room room = new Room(idRoom, roomName, country, countryCode);
            roomList.add(room);
        }
        resultSet.close();
        statement.close();
        MySQLConnUtils.disconnect();
        return roomList;
    }

    public void addRoom(Room room) throws SQLException, ClassNotFoundException {
        String sql = "insert into roomsdb.rooms(idRoom,roomName,country,countryCode) values (?,?,?,?);";
        MySQLConnUtils.getMySQLConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, room.getIdRoom());
        statement.setString(2, room.getRoomName());
        statement.setString(3, room.getCountry());
        statement.setString(4, room.getCountryCode());
        statement.executeUpdate();
        statement.close();
        MySQLConnUtils.disconnect();
    }
}
