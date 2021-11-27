
public class Box {

	private String size;
	private String colour;
	private int volume;
	private double price;
	
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		if(size.equalsIgnoreCase("")) 
			this.size = "Unknown";
		else
			this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		if(colour != "") 
			this.colour = "Unknown";
		else
			this.colour = colour;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume <= 0) 
			this.volume = 0;
		else
			this.volume = volume;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price <= 0) 
			this.price = 0;
		else 
			this.price = price;
	}

	public Box() {
		
	}
	
	
	public Box(String size, String colour, int volume, double price) {
		this.size = size;
		this.colour = colour;
		this.volume = volume;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Box [size=" + size + ", colour=" + colour + ", volume=" + volume + ", price=" + price + "]";
	}

	 boolean compareVolumes(int otherVolume) {
		
		if(this.volume >= otherVolume)
			return true;
		else
			return false;
		
	}
	 
	
}
