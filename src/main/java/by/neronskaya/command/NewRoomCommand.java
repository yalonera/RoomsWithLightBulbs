package by.neronskaya.command;

import by.neronskaya.bean.Room;
import by.neronskaya.command.logic.NewRoomLogic;
import by.neronskaya.resource.ConfigurationManager;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

public class NewRoomCommand implements ActionCommand {
    final static Logger logger = Logger.getLogger(NewRoomCommand.class);

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        int id = Integer.parseInt(request.getParameter("id"));
        String roomName = request.getParameter("roomName");
        String country = request.getParameter("country");
        String countryCode = request.getParameter("countryCode");

        if (request.getParameter("save") != null) {
            Room room = new Room(id, roomName, country, countryCode);
            NewRoomLogic.addRoom(room);
            page = ConfigurationManager.getProperty("path.page.list");
        }
        logger.info("adding new room");

        return page;


    }

}
