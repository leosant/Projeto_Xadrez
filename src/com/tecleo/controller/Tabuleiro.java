package com.tecleo.controller;

public class Tabuleiro {
	private Integer linhas;
	private Integer colunas;
	private Peca [][] peca;
	
	public Tabuleiro(Integer linhas, Integer colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		peca = new Peca[linhas][colunas];
	}

	public Integer getLinhas() {
		return linhas;
	}

	public void setLinhas(Integer linhas) {
		this.linhas = linhas;
	}

	public Integer getColunas() {
		return colunas;
	}

	public void setColunas(Integer colunas) {
		this.colunas = colunas;
	}
	
	public Peca peca(Integer linhas, Integer colunas) {
		return peca[linhas][colunas];
	}
	
	public Peca peca(Posicao posicao) {
		return peca[posicao.getLinhas()][posicao.getColunas()];
	}
}
