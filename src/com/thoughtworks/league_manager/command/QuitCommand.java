package com.thoughtworks.league_manager.command;

public class QuitCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public String name() {
        return "Quit";
    }
}
