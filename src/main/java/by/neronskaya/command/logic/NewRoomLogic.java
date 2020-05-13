package by.neronskaya.command.logic;

import by.neronskaya.bean.Room;
import by.neronskaya.dao.RoomDao;
import org.apache.log4j.Logger;

import java.sql.SQLException;

public class NewRoomLogic {
    final static Logger logger = Logger.getLogger(NewRoomLogic.class);

    public static void addRoom(Room room) {
        RoomDao roomDao = new RoomDao();
        try {
            roomDao.addRoom(room);
            logger.info("adding new room");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
