package models;

public abstract class Slim {

	protected int HP = 10;
	
	public void sofreDano(int dano) {
		HP -= dano;
		if (HP < 0) HP = 0;
	}
	
	public int getHP() {
		return HP;
	}
	
	public abstract Slim clone();
}
