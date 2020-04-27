package by.neronskaya.command.logic;

import by.neronskaya.bean.Room;
import by.neronskaya.dao.RoomDao;

import java.sql.SQLException;

public class NewRoomLogic {
    public static void addRoom(Room room) {
        RoomDao roomDao = new RoomDao();
        try {
            roomDao.addRoom(room);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
