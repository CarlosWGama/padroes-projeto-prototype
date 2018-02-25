import models.SlimVerde;

public class Main {

	public static void main(String[] args) {
		
		SlimVerde slim = new SlimVerde();
		slim.sofreDano(5);
		System.out.println("Vida " + slim.getHP());
	}
}
