package com.itdigital.samplemoviedb;

public class Genero {
    private final int id;
    private final String name;

    public Genero(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}