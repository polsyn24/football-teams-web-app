package pl.tomasz.grzelak.footballteamsweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tomasz.grzelak.footballteamsweb.models.League;
import pl.tomasz.grzelak.footballteamsweb.services.LeagueService;


import java.util.List;

@RestController
@RequestMapping("/api/leagues")
public class LeagueController {

    @Autowired
    private LeagueService leagueService;

    @GetMapping("")
    public List<League> getLeagues() {
        return leagueService.getAllLeagues();
    }

    @GetMapping("/{id}")
    public League getLeagueById(@PathVariable Long id) {
        return leagueService.getLeagueById(id);
    }

    @GetMapping("/")
    public League getLeagueByCountry(@RequestParam(value="country") String country) {
        return leagueService.getLeagueByCountry(country);
    }

    @DeleteMapping("/{id}")
    public void deleteLeagueById(@PathVariable long id) {
        leagueService.deleteLeagueById(id);
    }

}
