package models;

public class SlimVerde extends Slim {
	
	//Construtor publico para outras classe usarem
	public SlimVerde() {} 
	
	//Construtor apenas para o m�todo Clone
	private SlimVerde(SlimVerde original) {
		HP = original.getHP();
	}
		
	public Slim clone() {
		return new SlimVerde(this);
	}
}

