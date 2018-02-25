package models;

public class SlimVerde {

	private int HP = 10;
	
	public void sofreDano(int dano) {
		HP -= dano;
		if (HP < 0) HP = 0;
	}
	
	public int getHP() {
		return HP;
	}
}
