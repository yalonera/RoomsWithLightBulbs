package by.neronskaya.command.logic;

import by.neronskaya.bean.Room;
import by.neronskaya.dao.RoomDao;
import lombok.extern.log4j.Log4j;

import java.sql.SQLException;
@Log4j
public class NewRoomLogic {


    public static void addRoom(Room room) {
        RoomDao roomDao = new RoomDao();
        try {
            roomDao.addRoom(room);
            log.info("adding new room");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
