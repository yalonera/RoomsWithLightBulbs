package by.neronskaya.command.factory;

import by.neronskaya.command.ActionCommand;
import by.neronskaya.command.EmptyCommand;
import by.neronskaya.command.client.CommandEnum;
import by.neronskaya.resource.MessageManager;
import lombok.extern.log4j.Log4j;

import javax.servlet.http.HttpServletRequest;

@Log4j
public class ActionFactory {


    public ActionCommand defineCommand(HttpServletRequest request) {
        ActionCommand current = new EmptyCommand();
        // извлечение имени команды из запроса
        String action = request.getParameter("command");
        if (action == null || action.isEmpty()) {
            // если команда не задана в текущем запросе
            log.info("define command");
            return current;
        }
        // получение объекта, соответствующего команде
        try {
            CommandEnum currentEnum = CommandEnum.valueOf(action.toUpperCase());
            current = currentEnum.getCurrentCommand();
        } catch (IllegalArgumentException e) {
            request.setAttribute("wrongAction", action + MessageManager.getProperty("message.wrongaction"));
        }
        log.info("define command");
        return current;
    }
}
