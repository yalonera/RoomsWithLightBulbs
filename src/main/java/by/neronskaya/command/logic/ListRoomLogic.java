package by.neronskaya.command.logic;

import by.neronskaya.bean.Room;
import by.neronskaya.dao.RoomDao;

import java.sql.SQLException;
import java.util.List;

public class ListRoomLogic {
    public static List<Room> listRoom() throws SQLException, ClassNotFoundException {
        RoomDao roomDao = new RoomDao();
        return roomDao.getRoomList();
    }
}
