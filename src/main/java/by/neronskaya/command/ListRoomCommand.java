package by.neronskaya.command;

import by.neronskaya.bean.Room;
import by.neronskaya.command.logic.ListRoomLogic;
import by.neronskaya.resource.ConfigurationManager;
import lombok.extern.log4j.Log4j;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;
@Log4j
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
        log.info("show list");
        return page;
    }
}
