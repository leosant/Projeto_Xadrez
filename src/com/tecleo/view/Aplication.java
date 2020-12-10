package com.tecleo.view;

import com.tecleo.xadrez.PartidaXadrez;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		UI.printTabuleiro(partidaXadrez.getPecas());
	}

}
