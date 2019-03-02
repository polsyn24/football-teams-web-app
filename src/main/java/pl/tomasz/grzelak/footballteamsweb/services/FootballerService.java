package pl.tomasz.grzelak.footballteamsweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tomasz.grzelak.footballteamsweb.models.Footballer;
import pl.tomasz.grzelak.footballteamsweb.repositories.FootballerRepository;

import java.util.List;
import java.util.logging.Logger;

@Service
public class FootballerService {

    protected final Logger logger = Logger.getLogger(getClass().getName());

    @Autowired
    private FootballerRepository footballerRepository;

    public List<Footballer> getAllFootballers() {
        return footballerRepository.findAll();
    }

}
