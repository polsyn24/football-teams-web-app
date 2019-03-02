package pl.tomasz.grzelak.footballteamsweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.tomasz.grzelak.footballteamsweb.models.Footballer;

import java.util.List;

@Repository
public interface FootballerRepository extends JpaRepository<Footballer, Long> {
}
