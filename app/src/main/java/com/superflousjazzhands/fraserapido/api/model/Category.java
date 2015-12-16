package com.superflousjazzhands.fraserapido.api.model;

/**
 * Created by antoniocarella on 11/12/15.
 */
public class Category {

    String name;
    int rank;

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {

        return name;
    }

    public int getRank() {
        return rank;
    }

    public Category(String name, int rank) {

        this.name = name;
        this.rank = rank;
    }
}
