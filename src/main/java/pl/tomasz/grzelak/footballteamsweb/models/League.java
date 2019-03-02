package pl.tomasz.grzelak.footballteamsweb.models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="league")
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String country;

    private String leagueName;

    public League() {

    }

    public League(String country, String leagueName) {
        this.country = country;
        this.leagueName = leagueName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}
