package com.itdigital.samplemoviedb;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;

public class Estreias {
  private List<Filme> filmes;
  
  public Estreias() {
  }

  @JsonGetter("results")
  public List<Filme> getFilmes() {
    return filmes;
  }
}