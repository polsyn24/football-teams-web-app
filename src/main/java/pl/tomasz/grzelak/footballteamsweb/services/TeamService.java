package pl.tomasz.grzelak.footballteamsweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tomasz.grzelak.footballteamsweb.models.Team;
import pl.tomasz.grzelak.footballteamsweb.repositories.TeamRepository;

import java.util.List;
import java.util.logging.Logger;

@Service
public class TeamService {

    private TeamRepository teamRepository;
    protected final Logger logger = Logger.getLogger(getClass().getName());

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public List<Team> getAllTeamsByCountry(String country) {
        return teamRepository.findByCountry(country);
    }

    public void deleteTeamById(long id) {
        teamRepository.deleteById(id);
        logger.info(() -> "Usunięto ligę z ID: " + id);
    }

}
