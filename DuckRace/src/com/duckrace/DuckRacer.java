package com.duckrace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class DuckRacer {
    private final int id;
    private String name;
    private final List<Reward> rewards = new ArrayList<>();

    //Constructors
    public DuckRacer(int id, String name){
        this.id = id;
        setName(name);
    }

    //business or action methods
    public void win(Reward reward){
        rewards.add(reward);
    }

    // accessor methods
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Reward> getRewards() {
        return rewards;
    }

    //this is a derived property
    public int getWin() {
        return rewards.size();
    }

    @Override
    public String toString(){
        return String.format("%S: id=%S, name=%S, wins=%S, rewards=%S,",
                getClass().getSimpleName(), getId(), getName(), getWin(), getRewards());
    }
}