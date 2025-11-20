package Comparator;



public class Mobile {
	String name;
	int ram;
	int rom;
	String color;
	public Mobile(String name,int ram,int rom,String color)
	{
		this.name=name;
		this.ram=ram;
		this.rom=rom;
		this.color=color;
		
	}
	public String toString() {
		return "Mobile[name=" + name + ", color=" + color + ", ram=" + ram + ", rom=" + rom + "]";
	}
	
}
