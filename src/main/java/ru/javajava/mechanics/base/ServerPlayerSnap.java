package ru.javajava.mechanics.base;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;


/**
 * Created by ivan on 15.11.16.
 */
public class ServerPlayerSnap {
    @JsonProperty("id")
    private long userId;
    @JsonProperty("position")
    private Coords position;
    @JsonProperty("hp")
    private int hp;
    @JsonProperty("victims")
    private final Set<Long> victims = new HashSet<>();    // Кого убил данный игрок

    public Coords getPosition() {
        return position;
    }

    public void setPosition(Coords position) {
        this.position = position;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Set<Long> getVictims() {
        return victims;
    }

    public void setVictims(Collection<Long> victims) {
        this.victims.addAll(victims);
    }
}
