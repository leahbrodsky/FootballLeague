package com.thoughtworks.league_manager.command;

import com.thoughtworks.league_manager.menu.UserInput;
import com.thoughtworks.league_manager.model.League;

public class DisplayTeamCommand implements Command {
    private final UserInput userInput;
    private final League league;

    public DisplayTeamCommand(UserInput userInput, League league) {
        this.userInput = userInput;
        this.league = league;
    }

    @Override
    public void execute() {
        String teamName = userInput.input("Enter the name of the team to display:");
        league.displayTeam(teamName);
    }

    @Override
    public String name() {
        return "Display Team";
    }
}
