package pl.tomasz.grzelak.footballteamsweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tomasz.grzelak.footballteamsweb.models.Team;
import pl.tomasz.grzelak.footballteamsweb.services.TeamService;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("")
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @GetMapping("/{country}")
    public List<Team> getAllTeamsByCountry(@PathVariable String country) {
        return teamService.getAllTeamsByCountry(country);
    }

    @DeleteMapping("/{id}")
    public void deleteTeamById(@PathVariable long id) {
        teamService.deleteTeamById(id);
    }

}
