package pl.tomasz.grzelak.footballteamsweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.tomasz.grzelak.footballteamsweb.models.Team;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    List<Team> findByCountry(String country);
}

