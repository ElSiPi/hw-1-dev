package assignment;

public class Item {

	private int volume;
	private String name;

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Item() {
	}

	public Item(String name, int volume) {
		this.name = name;
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Item [volume=" + volume + ", name=" + name + "]";
	}
	
}
