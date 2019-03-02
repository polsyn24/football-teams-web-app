package pl.tomasz.grzelak.footballteamsweb.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String clubName;
    private String country;

    @ManyToOne
    @JoinColumn(name = "league_id")
    private League league;

    public Team() {

    }

    public Team(String clubName, String country, League league) {
        this.clubName = clubName;
        this.country = country;
        this.league = league;
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
}
