package Comprable;

public class ComaparableMobile implements Comparable<ComaparableMobile> {
	String name;
	int ram;
	int rom;
	String color;
	public ComaparableMobile(String name,int ram,int rom,String color)
	{
		this.name=name;
		this.ram=ram;
		this.rom=rom;
		this.color=color;
	}
	@Override
	public String toString() {
		return "Mobile[name=" + name + ", color=" + color + ", ram=" + ram + ", rom=" + rom + "]";
	}
	
	@Override
	public int compareTo(ComaparableMobile m) {
		return this.color.compareTo(m.color);
	}
} 