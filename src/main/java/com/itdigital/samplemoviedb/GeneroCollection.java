package com.itdigital.samplemoviedb;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;

public class GeneroCollection {
    private List<Genero> generos;
    
    public GeneroCollection() {
    }

    @JsonGetter("genres")
    public List<Genero> getGeneros() {
        return this.generos;
    }
}