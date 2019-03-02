package pl.tomasz.grzelak.footballteamsweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tomasz.grzelak.footballteamsweb.models.League;
import pl.tomasz.grzelak.footballteamsweb.repositories.LeagueRepository;


import java.util.List;
import java.util.logging.Logger;

@Service
public class LeagueService {

    protected final Logger logger = Logger.getLogger(getClass().getName());

    @Autowired
    private LeagueRepository leagueRepository;

    public List<League> getAllLeagues() {
        return leagueRepository.findAll();
    }

    public League getLeagueById(Long id) {
        return leagueRepository.findById(id).get();
    }

    public League getLeagueByCountry(String country) {
        return leagueRepository.findByCountry(country);
    }

    public League getLeagueByLeagueName(String leagueName) {
        return leagueRepository.findByLeagueName(leagueName);
    }

    public void deleteLeagueById(long id) {
        leagueRepository.deleteById(id);
        logger.info(() -> "Usunięto zespół z ID: " + id);
    }

    public void deleteLeagueByCountry(String country) {
        leagueRepository.deleteLeagueByCountry(country);
        logger.info(() -> "Usunięto zespół z kraju: " + country);
    }

}
