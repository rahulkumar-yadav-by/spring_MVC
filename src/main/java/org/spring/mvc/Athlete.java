package org.spring.mvc;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Component
public class Athlete {

//    @NotNull(message="This is a required field")
//    @Size(min=1,message=" Warning : Mandatory Field (@Size)")
    @NotEmpty(message=" Warning : Mandatory Field { @NotEmpty }")
    private String name;
    private String country;

    private String rank; //A,B,C,D
    private String[] tournaments;

    public Athlete() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String[] getTournaments() {
        return tournaments;
    }

    public void setTournaments(String[] tournaments) {
        this.tournaments = tournaments;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
