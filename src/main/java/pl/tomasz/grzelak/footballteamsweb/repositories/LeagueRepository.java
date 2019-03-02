package pl.tomasz.grzelak.footballteamsweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.tomasz.grzelak.footballteamsweb.models.League;

@Repository
public interface LeagueRepository extends JpaRepository<League, Long> {
    League   findByCountry(String country);
    League findByLeagueName(String leagueName);
    void deleteLeagueByCountry(String country);
}

