package com.itdigital.samplemoviedb;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;

public class Filme {
    private final int id;
	private final String title;
	private final String resumo;
	private int[] generoIds;
	private final List<Genero> generos;

	public Filme(int id, String title, String resumo, List<Genero> generos){
		this.id = id;
		this.title = title;
		this.resumo = resumo;
		this.generos = generos;
	}

	@JsonGetter("id")
	public int getId() {
		return id;
	}

	@JsonGetter("title")
	public String getTitle() {
		return title;
	}

	@JsonGetter("genre_ids")
	public int[] getGeneroIds() {
		return generoIds;
	}

	@JsonGetter("overview")
	public String getResumo() {
		return resumo;
	}

	public List<Genero> getGenros() {
		return this.generos;
	}

	public void addGenero(Genero genero) {
		this.generos.add(genero);
	}
}