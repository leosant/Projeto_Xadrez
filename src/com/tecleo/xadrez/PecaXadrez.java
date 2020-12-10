package com.tecleo.xadrez;

import com.tecleo.controller.Peca;
import com.tecleo.controller.Tabuleiro;

public class PecaXadrez extends Peca{
	
	private Color color;

	public PecaXadrez(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
}
