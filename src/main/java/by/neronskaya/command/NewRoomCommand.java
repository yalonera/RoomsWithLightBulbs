package by.neronskaya.command;

import by.neronskaya.bean.Room;
import by.neronskaya.command.logic.NewRoomLogic;
import by.neronskaya.resource.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

public class NewRoomCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        int idRoom = Integer.parseInt(request.getParameter("idRoom"));
        String roomName = request.getParameter("roomName");
        String country = request.getParameter("country");
        String countryCode = request.getParameter("countryCode");

        if (request.getParameter("save")!= null) {
            Room room = new Room(idRoom, roomName, country, countryCode);
            NewRoomLogic.addRoom(room);
            page = ConfigurationManager.getProperty("path.page.list");
        }

        return page;


    }

}
