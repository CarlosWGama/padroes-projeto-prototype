package models;

public class SlimVermelho extends Slim {
	
	//Construtor publico para outras classe usarem
	public SlimVermelho() {} 
	
	//Construtor apenas para o método Clone
	private SlimVermelho(SlimVermelho original) {
		HP = original.getHP();
	}
	
	public Slim clone() {
		return new SlimVermelho(this);
	}
}
