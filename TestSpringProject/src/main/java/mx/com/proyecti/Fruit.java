package mx.com.proyecti;

public class Fruit {
	
	private String fruitName;

	public String talkAboutMe() {
		return "I am a fruit, I come from plants and trees, I'm " + fruitName;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public Fruit(String fruitName) {
		super();
		this.fruitName = fruitName;
	}
	
	public Fruit() {
		
	}
}
