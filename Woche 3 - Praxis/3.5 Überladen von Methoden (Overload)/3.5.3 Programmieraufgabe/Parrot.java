class Parrot extends Animal {

	void speak() {
		System.out.println("Ich kann sprechen");
	}
	
	@Override
	void move()
	{
	    System.out.println("Ich fliege");
	}
	
	void speak(String input)
	{
	    System.out.println(input);
	}

}