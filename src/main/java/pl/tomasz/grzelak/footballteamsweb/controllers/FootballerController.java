package pl.tomasz.grzelak.footballteamsweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.tomasz.grzelak.footballteamsweb.models.Footballer;
import pl.tomasz.grzelak.footballteamsweb.services.FootballerService;

import java.util.List;

@RestController
@RequestMapping("/api/footballers")
public class FootballerController {

    @Autowired
    private FootballerService footballerService;

    @GetMapping("")
    public List<Footballer> getAllFootballers() {
        return footballerService.getAllFootballers();
    }

}

