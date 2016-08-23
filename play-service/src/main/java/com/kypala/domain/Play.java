package com.kypala.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Play {

    @Id @GeneratedValue
    private Long id;

    private String playName;

    Play() { // why JPA why??? :)
    }

    public Play(String playName) {
        this.playName = playName;
    }

    public Long getId() {
        return id;
    }

    public String getPlayName() {
        return playName;
    }

    @Override
    public String toString() {
        return "Play{" +
                "id=" + id +
                ", playName='" + playName + '\'' +
                '}';
    }
}
