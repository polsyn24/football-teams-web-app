package pl.tomasz.grzelak.footballteamsweb.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;

@CrossOrigin
@Entity
@Table(name="team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String clubName;
    private String country;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "league_id")
    private League league;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    @JsonManagedReference
    private List<Footballer> footballers;

    public Team() {
    }

    public Team(String clubName, String country, League league, List<Footballer> footballers) {
        this.clubName = clubName;
        this.country = country;
        this.league = league;
        this.footballers = footballers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public List<Footballer> getFootballers() {
        return footballers;
    }

    public void setFootballers(List<Footballer> footballers) {
        this.footballers = footballers;
    }
}
