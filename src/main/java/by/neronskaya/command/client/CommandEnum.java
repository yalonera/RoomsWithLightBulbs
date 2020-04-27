package by.neronskaya.command.client;


import by.neronskaya.command.ActionCommand;
import by.neronskaya.command.ListRoomCommand;
import by.neronskaya.command.NewRoomCommand;

public enum CommandEnum {
    ADD
            {
                {
                    this.command = new NewRoomCommand();
                }
            },

    LISTROOM
            {
                {
                    this.command = new ListRoomCommand();
                }
            }; /*
    OPENROOM
            {
                {
                    this.command = new LogoutCommand();
                }
            };

     */
    ActionCommand command;
    public ActionCommand getCurrentCommand() {
        return command;
    }
}
