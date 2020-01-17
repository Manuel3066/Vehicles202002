package week1;

public class CatBus {
	private String name;
	private String color;
	private int age;

	public CatBus() {
	}

	public CatBus(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String makeNoise() {
		// TODO Auto-generated method stub
		return "MEOW! HONK!";
	}

}
