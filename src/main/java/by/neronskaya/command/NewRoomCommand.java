package by.neronskaya.command;

import by.neronskaya.bean.Room;
import by.neronskaya.command.logic.NewRoomLogic;
import by.neronskaya.resource.ConfigurationManager;
import lombok.extern.log4j.Log4j;

import javax.servlet.http.HttpServletRequest;

@Log4j
public class NewRoomCommand implements ActionCommand {


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
        log.info("adding new room");

        return page;


    }

}
