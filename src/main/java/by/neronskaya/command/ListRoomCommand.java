package by.neronskaya.command;

import by.neronskaya.bean.Room;
import by.neronskaya.command.logic.ListRoomLogic;
import by.neronskaya.resource.ConfigurationManager;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

public class ListRoomCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        ServletContext servletContext;
        String page = null;
        try {
            List<Room> roomList = ListRoomLogic.listRoom();
            request.setAttribute("roomList", roomList);
            page = ConfigurationManager.getProperty("path.page.list");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (request.getParameter("openRoom") != null) {
            page = ConfigurationManager.getProperty("path.page.open");
        }
        return page;
    }
}
