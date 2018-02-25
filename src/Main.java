import models.SlimVerde;

public class Main {

	public static void main(String[] args) {		
		SlimVerde slimOriginal = new SlimVerde();
		SlimVerde slimCopia = (SlimVerde) slimOriginal.clone();
		
		slimCopia.sofreDano(4); //HP de cópia cai para 6
		System.out.println(slimOriginal.getHP()); //HP de original continua 10
	}
}
