public class Story {

	public static void main(String[] args) {
		Parrot paco = new Parrot();
		Robot ronja = new Robot();
		SuperVillain eikeVil = new SuperVillain();
		paco.fly();
		eikeVil.fly();
		eikeVil.tryToCatch(false);
		ronja.fly();
		ronja.tryToCatch(true);
	}
}
